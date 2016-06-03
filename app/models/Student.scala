package models

import play.api.libs.json.{JsPath, Json}
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

/**
 * Created by sam on 6/1/16.
 */
case class Student(id: Int, firstname: String, lastname: String, age: Int)

object Student{
  //implicit val format = Json.format[Student]

  implicit val studentRead: Reads[Student] = (
    (JsPath \ "id").read[Int] and
    (JsPath \ "firstname").read[String] and
    (JsPath \ "lastname").read[String] and
    (JsPath \ "age").read[Int]
    )(Student.apply _)

  implicit val studentWrite = (
    (JsPath \ "id").write[Int] and
    (JsPath \ "firstname").write[String] and
    (JsPath \ "lastname").write[String] and
    (JsPath \ "age").write[Int]
    )(unlift(Student.unapply))

}