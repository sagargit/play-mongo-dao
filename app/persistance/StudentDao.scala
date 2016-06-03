package persistance

import models.Student
import play.api.libs.json.{JsObject, Writes, Json, Reads}
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.ReactiveMongoPlugin
import play.api.Play.current
import scala.concurrent.ExecutionContext
import ExecutionContext.Implicits.global
import play.modules.reactivemongo.json._//,ImplicitBSONHandlers._
import scala.concurrent.Future


object StudentDao {

  implicit val sreader: Reads[Student] = Json.reads[Student]
  implicit val swriter: Writes[Student] = Json.writes[Student]

  val queryReader: Reads[JsObject] = implicitly[Reads[JsObject]]
  def db = ReactiveMongoPlugin.db

  def collection: JSONCollection = db[JSONCollection]("student")

  def insertStudent(student: Student): Future[JsObject]={
    val modelToJsObj = swriter.writes(student).as[JsObject]
    collection.insert(modelToJsObj) map (_ => modelToJsObj)
  }
  def find(filter:JsObject):Future[Seq[JsObject]]={
    collection.find(filter).cursor[JsObject].collect[List]() // collect is very imp for getting collection of documents
  }

  def findOne(t: JsObject): Future[Option[JsObject]]={
    collection.find(t).cursor[JsObject].headOption
  }
  // collection.find( { $or:[  ] } )

  def update(filter:JsObject,student: Student):Future[Unit]= {
    val modelToJsObj = swriter.writes(student).as[JsObject]
    collection.update(filter,Json.obj("$set"->modelToJsObj)) map (_=>())
  }

  def delete(filter:JsObject):Future[Unit]={
    collection.remove(filter) map(_=>())
  }

}
