package Persistance

import models.{Student, Person}
import play.api.libs.json.{Json, JsObject, Writes, Reads}
import play.modules.reactivemongo.ReactiveMongoPlugin
import play.modules.reactivemongo.json.collection.JSONCollection
import play.api.Play.current
import scala.concurrent.{ExecutionContext, Future}
import ExecutionContext.Implicits.global
import play.modules.reactivemongo.json._,ImplicitBSONHandlers._

/**
 * Created by admin on 12/11/2014.
 */
object DaoAndEntity {
  //for Person
  val reader: Reads[Person] = Json.reads[Person]
  val writer: Writes[Person] = Json.writes[Person]

  val queryReader: Reads[JsObject] = implicitly[Reads[JsObject]]


  def db = ReactiveMongoPlugin.db

  def collection: JSONCollection = db[JSONCollection]("person")


  def insert(person:Person):Future[JsObject]={
    val modelToJsObj = writer.writes(person).as[JsObject]
    collection.insert(modelToJsObj) map (_ => modelToJsObj) // JsObject returned to display
  }

  def find(filter:JsObject):Future[Seq[JsObject]]={

    collection.find(filter).cursor[JsObject].collect[List]() // collect is very imp for getting collection of documents

  }

  def findOne(t: JsObject): Future[Option[JsObject]]={
    collection.find(t).cursor[JsObject].headOption
  }

 // collection.find( { $or:[  ] } )

  def update(filter:JsObject,person:Person):Future[Unit]= {
    val modelToJsObj = writer.writes(person).as[JsObject]
    collection.update(filter,Json.obj("$set"->modelToJsObj)) map (_=>())
  }

  def delete(filter:JsObject):Future[Unit]={
    collection.remove(filter) map(_=>())
  }
}
