package utils

import play.api.libs.json.{Json, JsObject}


object RequestParamParser {

  def parseQueryStringOr(queryString: Map[String, Seq[String]]): JsObject = {
    val id = queryString.get("id").flatMap(_.headOption).getOrElse("-123").toInt
    val firstname = queryString.get("firstname").flatMap(_.headOption).getOrElse("@%$^^").trim
    val lastname = queryString.get("lastname").flatMap(_.headOption).getOrElse("&($@#").trim
    val age = queryString.get("age").flatMap(_.headOption).getOrElse("-1234").toInt
    Json.obj("$or"->Json.arr(Json.obj("id"->id),Json.obj("firstname"->firstname),Json.obj("lastname"->lastname),Json.obj("age"->age)))
  }

  def parseQueryStringAnd(queryString: Map[String, Seq[String]]): JsObject = {
    val id = queryString.get("id").flatMap(_.headOption).getOrElse("-123").toInt
    val firstname = queryString.get("firstname").flatMap(_.headOption).getOrElse("@%$^^").trim
    val lastname = queryString.get("lastname").flatMap(_.headOption).getOrElse("&($@#").trim
    val age = queryString.get("age").flatMap(_.headOption).getOrElse("-1234").toInt
    Json.obj("$and"->Json.arr(Json.obj("id"->id),Json.obj("firstname"->firstname),Json.obj("lastname"->lastname),Json.obj("age"->age)))
  }

}