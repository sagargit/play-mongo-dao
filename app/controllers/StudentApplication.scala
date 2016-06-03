package controllers

import controllers.Application._
import persistance.StudentDao
import models.Student
import play.api.libs.json._
import play.api.mvc.BodyParsers.parse
import play.api.mvc._
//import reactivemongo.bson.BSONObjectID
import utils.RequestParamParser
import scala.concurrent.{Future, ExecutionContext}
import ExecutionContext.Implicits.global
//import scala.util.Try
import Student._
import play.modules.reactivemongo.json._//,ImplicitBSONHandlers._

object StudentApplication {

  val queryReader: Reads[JsObject] = implicitly[Reads[JsObject]]

  def saveStudent: EssentialAction = Action.async(parse.json) { request =>
    request.body.validate[Student].map {
      k => StudentDao.insertStudent(k).map{
        l =>Ok("Inserted Successfully")
      }
    }.getOrElse(Future.successful(BadRequest("Invalid Json")))
  }

  def searchAllStudent = Action.async(parse.json) { request =>
    val filteredJsObj = request.body.asOpt[JsObject].getOrElse(Json.obj())
    StudentDao.find(filteredJsObj).map(_.map( js => transformMongoFields(js))) map {
      case Nil => NotFound
      case l: Seq[JsObject] => Ok(Json.toJson(l))
    }
  }

  def searchStudentWithOr() = Action.async { request =>
    //val queryString = request.queryString.map{case (k,v) => k-> v.mkString}
    val query = RequestParamParser.parseQueryStringOr(request.queryString)
    StudentDao.find(query) map {
      case Nil => NotFound("searched student not found")
      case l: Seq[JsObject] => Ok(Json.toJson(l))
    }
  }

  def searchStudentWithAnd = Action.async{
    request =>
      val query2 = RequestParamParser.parseQueryStringAnd(request.queryString)
      StudentDao.find(query2) map {
        case Nil=> Ok("searched student not found")
        case l: Seq[JsObject] => Ok(Json.toJson(l))
      }
  }

  def searchOneStudent = Action.async(parse.json){ request =>
    val filteredJsObj = request.body.asOpt[JsObject].getOrElse(Json.obj())
    StudentDao.findOne(filteredJsObj).map( _.map( js => transformMongoFields(js))) map {
      case None => NotFound
      case Some(t)=> Ok(Json.toJson(t))
    }
  }

  def findStudentById(id: String) = Action.async {
    val eg= Json.obj("_id"->Json.obj("$oid"->id))
    StudentDao.findOne(eg).map( _.map( js => transformMongoFields(js))) map {
      case None => Ok("Person not found")
      case Some(t)=> Ok(Json.toJson(t))
    }
  }

  protected def transformMongoFields(jsObject: JsObject): JsObject = {
    val jsObjectWithStringFieldId = jsObject \ "_id" match {
      case s: JsString => jsObject
      case o: JsObject => jsObject.transform(writeId).get
      case _ => jsObject // no id present
    }
    val repl = Json.stringify(jsObjectWithStringFieldId)
    Json.parse(repl).as[JsObject]
  }
  val writeId = __.json.update((__ \ '_id).json.copyFrom((__ \ '_id \'$oid).json.pick))

  def change(id:String) = Action.async(parse.json){
    request =>
      val studentToUpdate = Json.fromJson(request.body)(StudentDao.sreader)
      StudentDao.update(Json.obj("_id"->Json.obj("$oid"->id)),studentToUpdate.get).map(_=>Ok("Updated"))
  }

  def remove(id:String) = Action.async {
    StudentDao.delete(Json.obj("_id"->Json.obj("$oid"->id))) map (_=> Ok("Deleted"))
  }

}
