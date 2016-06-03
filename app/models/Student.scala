package models

import play.api.libs.json.{JsPath, Reads}
import play.api.libs.json.Reads._
import play.api.libs.json.Writes._
import play.api.libs.json._
import play.api.libs.functional.syntax._

/**
 * Created by srijesh on 5/31/16.
 */
case class Student(firstname: String, lastname: String, age: Int)

object Student{
 // implicit val format = Json.format[Student]

  implicit val studentReads: Reads[Student] = (
    (JsPath  \ "firstname").read[String](minLength[String](2)) and
    (JsPath  \ "lastname").read[String]  and
    (JsPath \ "age").read[Int]
    )(Student.apply _)

  implicit val studentWrites: Writes[Student] =(
    (JsPath \ "firstname").write[String] and
    (JsPath \ "lastname").write[String] and
    (JsPath \ "age").write[Int]
    )(unlift(Student.unapply))

}
