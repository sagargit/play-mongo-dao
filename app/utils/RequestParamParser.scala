package utils


import play.api.libs.json.{Json, JsObject}

/**
 * Created by srijesh on 6/2/16.
 */
object RequestParamParser {

  def parseQueryString(queryString: Map[String, Seq[String]]): JsObject = {

    val name = queryString.get("name").flatMap(_.headOption).getOrElse("@$^^").trim
    val sem  = queryString.get("sem").flatMap(_.headOption).getOrElse("-11").toInt
    val roll  = queryString.get("roll").flatMap(_.headOption).getOrElse("-1").toInt
    val monitor = queryString.get("monitor").flatMap(_.headOption).getOrElse("-123")
    val query1 = Json.obj("$or"->Json.arr(Json.obj("name"->name),Json.obj("sem" -> sem),Json.obj("roll"->roll),Json.obj("monitor"->monitor)))
    query1
   // Json.obj("$or"->Json.arr(Json.obj("name"->name),Json.obj("roll"->roll),Json.obj("monitor"->monitor)))
  }


  def parseAndQueryString(queryString: Map[String, Seq[String]]): JsObject = {
    val name = queryString.get("name").flatMap(_.headOption).getOrElse("@$^^").trim
    val sem  = queryString.get("sem").flatMap(_.headOption).getOrElse("-11").toInt
    val roll  = queryString.get("roll").flatMap(_.headOption).getOrElse("-1").toInt
    val monitor = queryString.get("monitor").flatMap(_.headOption).getOrElse("-123")
    val query2 = Json.obj("$and" -> Json.arr(Json.obj("name"->name),Json.obj("sem"->sem),Json.obj("roll"->roll),Json.obj("monitor"->monitor)))
    query2
    // Json.obj("$or"->Json.arr(Json.obj("name"->name),Json.obj("roll"->roll),Json.obj("monitor"->monitor)))
  }

  //For Student

  def parseQueryStringOfStudent(queryString: Map[String, Seq[String]]): JsObject = {
    val firstname = queryString.get("firstname").flatMap(_.headOption).getOrElse("&$#").trim
    val lastname = queryString.get("lastname").flatMap(_.headOption).getOrElse("@&^^@").trim
    val age      = queryString.get("age").flatMap(_.headOption).getOrElse("-12").toInt
    val query3 = Json.obj("$or" -> Json.arr(Json.obj("firstname" -> firstname), Json.obj("lastname" -> lastname), Json.obj("age" -> age)))

   query3

  }

  def parseAndQueryStringOfStudent(queryString: Map[String, Seq[String]]): JsObject = {
    val firstname = queryString.get("firstname").flatMap(_.headOption).getOrElse("&$#").trim
    val lastname = queryString.get("lastname").flatMap(_.headOption).getOrElse("@&^^@").trim
    val age      = queryString.get("age").flatMap(_.headOption).getOrElse("-12").toInt
    val query4 = Json.obj("$and" -> Json.arr(Json.obj("firstname" -> firstname), Json.obj("lastname" -> lastname), Json.obj("age" -> age)))

    query4

  }


}
