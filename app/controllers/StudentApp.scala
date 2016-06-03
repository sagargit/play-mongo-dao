package controllers

import controllers.PersonApp._
import models.Student
import models.Student._
import Persistance.StudentDaoAndEntity
import play.api.libs.json._
import play.api.mvc.Action
import play.api.mvc.BodyParsers.parse
import reactivemongo.bson.BSONObjectID
import utils.RequestParamParser
import scala.concurrent.{ExecutionContext, Future}
import ExecutionContext.Implicits.global
import scala.util.Try
import play.modules.reactivemongo.json._,ImplicitBSONHandlers._

/**
 * Created by srijesh on 6/2/16.
 */
object StudentApp {

  val studentDao = StudentDaoAndEntity
  val studentqueryReader: Reads[JsObject] = implicitly[Reads[JsObject]]


  def saveStudent = Action.async(parse.json){ request =>
    request.body.validate[Student].map{
      k => studentDao.insertStudent(k).map{
        l => Ok("Successfully inserted")
      }
    }.getOrElse(Future.successful(BadRequest("Invalid Json")))
  }

  def searchStudent = Action.async(parse.json){ request =>
    val filteredStudentJsObj = request.body.asOpt[JsObject].getOrElse(Json.obj())
    studentDao.find(filteredStudentJsObj).map(_.map(js => transformMongoFields(js))) map {
      case Nil => NotFound
      case l:Seq[JsObject] => Ok(Json.toJson(l))
    }
  }

  //search student with or operation
  def searchWithOrForStudent = Action.async{
    request =>
      val querystring = request.queryString.map{case (k,v) => k -> v }
      val query = RequestParamParser.parseQueryStringOfStudent(querystring)
      //val query = Json.obj("$or" -> Json.arr(Json.obj("firstname" -> firstname), Json.obj("lastname" -> lastname), Json.obj("age"->age)))
      studentDao.find(query) map{
        case Nil => Ok("Searched Person Not Found")
        case l:Seq[JsObject] => Ok(Json.toJson(l))
      }
  }

  //search student with and operation
  def searchWithAndForStudent = Action.async{
    request =>
      val querystring = request.queryString.map{case (k,v) => k -> v}
      val query = RequestParamParser.parseAndQueryStringOfStudent(querystring)
      //val query1 = Json.obj("$and"->Json.arr(Json.obj("firstname"->firstname), Json.obj("age"->age)))
        studentDao.find(query) map {
        case Nil=> Ok("Searched Student Not Found")
        case l:Seq[JsObject] => Ok(Json.toJson(l))
      }
  }


  def searchFirstStudent = Action.async(parse.json){ request =>
    val filteredJsObj = request.body.asOpt[JsObject].getOrElse(Json.obj())
     println(filteredJsObj)
    //  val filteredJsObj= filter(request)
    //val jsObj = Json.fromJson(filteredJsObj)(queryReader).getOrElse(Json.obj())
    studentDao.findFirstStudent(filteredJsObj).map( _.map( js => transformMongoFields(js))) map {
      case None => NotFound
      case Some(t)=> Ok(Json.toJson(t))
    }
  }



  // this method converts the input id in string into the required BSONObjectId implicitly
  implicit object BSONObjectIDFormat extends Format[BSONObjectID] {
    def writes(objectId: BSONObjectID): JsValue = JsString(objectId.stringify)
    def reads(json: JsValue): JsResult[BSONObjectID] = json match {
      case JsString(x) => {
        val maybeOID: Try[BSONObjectID] = BSONObjectID.parse(x)
        if(maybeOID.isSuccess) JsSuccess(maybeOID.get) else {
          JsError("Expected BSONObjectID as JsString")
        }
      }
      case _ => JsError("Expected BSONObjectID as JsString")
    }
  }


  def findById(id:String) = Action.async {
    val eg= Json.obj("_id"->Json.obj("$oid"->id))
    //  val bid= Json.obj("_id" -> JsString(id)) // /getById/5489ba01b5f1442bdb9fd25d
    studentDao.findFirstStudent(eg).map( _.map( js => transformMongoFields(js))) map
      {
        case None => Ok("Person not found")
        case Some(t)=> Ok(Json.toJson(t))
      }
  }


  // this method is used to modify the id in the json after receiving them from database
  protected def transformMongoFields(jsObject: JsObject): JsObject = {
    val jsObjectWithStringifiedId = (jsObject \ "_id") match {
      case s: JsString => jsObject
      case o: JsObject => jsObject.transform(writeId).get
      case _ => jsObject // no id present
    }
    val repl = Json.stringify(jsObjectWithStringifiedId)
    Json.parse(repl).as[JsObject]
  }
  val writeId = (__.json.update((__ \ '_id).json.copyFrom((__ \ '_id \'$oid).json.pick)))

  def change(id:String) = Action.async(parse.json){
    request =>
      val studentToUpdate = Json.fromJson(request.body)(studentDao.sreader)
      studentDao.updateStudent(Json.obj("_id"->Json.obj("$oid"->id)),studentToUpdate.get).map(_=>Ok("Updated"))
  }

  def removeStudent(id:String) = Action.async {
    studentDao.deleteStudent(Json.obj("_id"->Json.obj("$oid"->id))) map (_=> Ok("Deleted"))
  }


}
