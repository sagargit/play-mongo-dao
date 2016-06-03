package controllers

import Persistance. DaoAndEntity
import models.Person
import models.Person._
import play.api.libs.json._
import play.api.mvc._
import reactivemongo.bson.BSONObjectID
import utils.RequestParamParser
import scala.concurrent.{Future, ExecutionContext}
import ExecutionContext.Implicits.global
import scala.util.Try
import play.modules.reactivemongo.json._,ImplicitBSONHandlers._


object PersonApp extends Controller {

  val dao = DaoAndEntity
  val queryReader: Reads[JsObject] = implicitly[Reads[JsObject]]


  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

 //insert employee
   def save:EssentialAction = Action.async(parse.json){ request =>
    request.body.validate[Person].map{
      k => dao.insert(k).map{
        l => Ok("Successfully inserted")
      }
    }.getOrElse(Future.successful(BadRequest("Invalid Json")))
  }


//search employee
  def search = Action.async(parse.json) {
    request =>
   //val jsObj = Json.fromJson(request.body)(dao.reader) // just for validation
   val filteredJsObj = request.body.asOpt[JsObject].getOrElse(Json.obj())
   //val filteredJsObj = filter(request)
  //val jsObj = Json.fromJson(filteredJsObj)(queryReader).getOrElse(Json.obj())
   dao.find(filteredJsObj).map(_.map( js => transformMongoFields(js))) map {
     case Nil => NotFound
     case l:Seq[JsObject] => Ok(Json.toJson(l))
   }
  }

  def searchWithOr = Action.async{
        request =>
          val querystring = request.queryString.map {case(k,v) => k->v}
          val query = RequestParamParser.parseQueryString(querystring)
          //val query = RequestParamParser.parseQueryString(request.queryString)
          dao.find(query) map {
        case Nil=> Ok("searched person not found")
        case l:Seq[JsObject] => Ok(Json.toJson(l))
      }
  }

  def searchWithAnd = Action.async{
    request =>
     val querystring = request.queryString.map {case(k,v) => k -> v}
     val query = RequestParamParser.parseAndQueryString(querystring)
      dao.find(query) map {
        case Nil=> Ok("searched person not found")
        case l:Seq[JsObject] => Ok(Json.toJson(l))
      }
  }


  def searchOne = Action.async(parse.json){ request =>
    val filteredJsObj = request.body.asOpt[JsObject].getOrElse(Json.obj())
    //  val filteredJsObj= filter(request)
    //val jsObj = Json.fromJson(filteredJsObj)(queryReader).getOrElse(Json.obj())
    dao.findOne(filteredJsObj).map( _.map( js => transformMongoFields(js))) map {
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
    dao.findOne(eg).map( _.map( js => transformMongoFields(js))) map
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
      val personToUpdate = Json.fromJson(request.body)(dao.reader)
      dao.update(Json.obj("_id"->Json.obj("$oid"->id)),personToUpdate.get).map(_=>Ok("Updated"))
  }

  def remove(id:String) = Action.async {
    dao.delete(Json.obj("_id"->Json.obj("$oid"->id))) map (_=> Ok("Deleted"))
  }
}