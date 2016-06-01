package models


import play.api.libs.json.Json

/**
 * Created by admin on 12/11/2014.
 */
case class Person(name:Option[String],sem:Option[BigDecimal],roll:Option[BigDecimal],monitor:Option[Boolean])

object Person{
  implicit val format = Json.format[Person]
}

//{     "name": "try",     "sem": 10,     "roll": 4,     "monitor": false }


