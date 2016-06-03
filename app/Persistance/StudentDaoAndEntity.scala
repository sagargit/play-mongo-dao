package Persistance

import models.Student
import play.api.libs.json.{Json, JsObject, Writes, Reads}
import play.modules.reactivemongo.ReactiveMongoPlugin
import play.modules.reactivemongo.json.collection.JSONCollection
import play.api.Play.current
import scala.concurrent.{ExecutionContext, Future}
import ExecutionContext.Implicits.global
import play.modules.reactivemongo.json._,ImplicitBSONHandlers._

/**
 * Created by srijesh on 6/1/16.
 */
object StudentDaoAndEntity {

  val sreader: Reads[Student] = Json.reads[Student]
  val swriter: Writes[Student] = Json.writes[Student]

  val studentqueryReader: Reads[JsObject] = implicitly[Reads[JsObject]]

  def db = ReactiveMongoPlugin.db

  def collection: JSONCollection = db[JSONCollection]("student")

  def insertStudent(student: Student): Future[JsObject]= {
    val modelToJsObj = swriter.writes(student).as[JsObject]
    collection.insert(modelToJsObj) map (_ => modelToJsObj)
  }

  def find(filter: JsObject):Future[Seq[JsObject]]= {

    collection.find(filter).cursor[JsObject].collect[List]() // collect is very imp for getting collection of documents

  }

  def findFirstStudent(oneStd: JsObject): Future[Option[JsObject]] = {
    collection.find(oneStd).cursor[JsObject].headOption
  }

  def updateStudent(filter:JsObject, student: Student): Future[Unit] = {
    val modelToJsObj = swriter.writes(student).as[JsObject]
    collection.update(filter, Json.obj("$set" -> modelToJsObj)) map (_ =>())
  }

  def deleteStudent(filter: JsObject):Future[Unit] ={
    collection.remove(filter) map(_ => ())
  }


}
