package models

import play.api.libs.json.Json

/**
 * Created by sam on 6/1/16.
 */
case class Student(id: Int, firstname: String, lastname: String, age: Int)

object student{
  implicit val format = Json.format[Student]
}