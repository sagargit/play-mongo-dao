// @SOURCE:/home/srijesh/dev/projects/play-mongo-dao/conf/routes
// @HASH:8e4df60a9f24034985f65d173a86331ecd8961da
// @DATE:Thu Jun 02 16:25:12 NPT 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_PersonApp_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_PersonApp_index0_invoker = createInvoker(
controllers.PersonApp.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_PersonApp_findById1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonApp_findById1_invoker = createInvoker(
controllers.PersonApp.findById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "findById", Seq(classOf[String]),"GET", """""", Routes.prefix + """getById/$id<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_StudentApp_findById2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getByStudentId/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_StudentApp_findById2_invoker = createInvoker(
controllers.StudentApp.findById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "findById", Seq(classOf[String]),"GET", """""", Routes.prefix + """getByStudentId/$id<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_PersonApp_save3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("save"))))
private[this] lazy val controllers_PersonApp_save3_invoker = createInvoker(
controllers.PersonApp.save,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "save", Nil,"POST", """/getById/5489ba79b5f1442bdb9fd25e""", Routes.prefix + """save"""))
        

// @LINE:11
private[this] lazy val controllers_PersonApp_search4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_PersonApp_search4_invoker = createInvoker(
controllers.PersonApp.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "search", Nil,"POST", """""", Routes.prefix + """search"""))
        

// @LINE:12
private[this] lazy val controllers_PersonApp_searchOne5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchOne"))))
private[this] lazy val controllers_PersonApp_searchOne5_invoker = createInvoker(
controllers.PersonApp.searchOne,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "searchOne", Nil,"POST", """""", Routes.prefix + """searchOne"""))
        

// @LINE:13
private[this] lazy val controllers_PersonApp_searchWithOr6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithOr"))))
private[this] lazy val controllers_PersonApp_searchWithOr6_invoker = createInvoker(
controllers.PersonApp.searchWithOr,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "searchWithOr", Nil,"GET", """""", Routes.prefix + """searchWithOr"""))
        

// @LINE:14
private[this] lazy val controllers_PersonApp_searchWithAnd7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithAnd"))))
private[this] lazy val controllers_PersonApp_searchWithAnd7_invoker = createInvoker(
controllers.PersonApp.searchWithAnd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "searchWithAnd", Nil,"GET", """""", Routes.prefix + """searchWithAnd"""))
        

// @LINE:16
private[this] lazy val controllers_PersonApp_change8_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonApp_change8_invoker = createInvoker(
controllers.PersonApp.change(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "change", Seq(classOf[String]),"PUT", """GET          /searchWithOr/:name/:roll/:monitor        controllers.Application.searchWithOr(name:Option[String],roll:Option[BigDecimal],monitor:Option[Boolean])""", Routes.prefix + """update/$id<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_PersonApp_remove9_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonApp_remove9_invoker = createInvoker(
controllers.PersonApp.remove(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "remove", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """delete/$id<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_StudentApp_saveStudent10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveStudent"))))
private[this] lazy val controllers_StudentApp_saveStudent10_invoker = createInvoker(
controllers.StudentApp.saveStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "saveStudent", Nil,"POST", """Students""", Routes.prefix + """saveStudent"""))
        

// @LINE:20
private[this] lazy val controllers_StudentApp_searchStudent11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchStudent"))))
private[this] lazy val controllers_StudentApp_searchStudent11_invoker = createInvoker(
controllers.StudentApp.searchStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchStudent", Nil,"POST", """""", Routes.prefix + """searchStudent"""))
        

// @LINE:21
private[this] lazy val controllers_StudentApp_searchFirstStudent12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchFirstStudent"))))
private[this] lazy val controllers_StudentApp_searchFirstStudent12_invoker = createInvoker(
controllers.StudentApp.searchFirstStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchFirstStudent", Nil,"POST", """""", Routes.prefix + """searchFirstStudent"""))
        

// @LINE:22
private[this] lazy val controllers_StudentApp_searchWithOrForStudent13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithOrForStudent"))))
private[this] lazy val controllers_StudentApp_searchWithOrForStudent13_invoker = createInvoker(
controllers.StudentApp.searchWithOrForStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchWithOrForStudent", Nil,"GET", """""", Routes.prefix + """searchWithOrForStudent"""))
        

// @LINE:23
private[this] lazy val controllers_StudentApp_searchWithAndForStudent14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithAndForStudent"))))
private[this] lazy val controllers_StudentApp_searchWithAndForStudent14_invoker = createInvoker(
controllers.StudentApp.searchWithAndForStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchWithAndForStudent", Nil,"GET", """""", Routes.prefix + """searchWithAndForStudent"""))
        

// @LINE:25
private[this] lazy val controllers_StudentApp_change15_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateStudent/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_StudentApp_change15_invoker = createInvoker(
controllers.StudentApp.change(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "change", Seq(classOf[String]),"PUT", """GET          /searchWithAndPerson/:name/:roll/:monitor  controllers.Application.searchWithAndPerson(name:String,roll:Int,monitor:Boolean)""", Routes.prefix + """updateStudent/$id<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_StudentApp_removeStudent16_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteStudent/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_StudentApp_removeStudent16_invoker = createInvoker(
controllers.StudentApp.removeStudent(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "removeStudent", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """deleteStudent/$id<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_Assets_at17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.PersonApp.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getById/$id<[^/]+>""","""controllers.PersonApp.findById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getByStudentId/$id<[^/]+>""","""controllers.StudentApp.findById(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """save""","""controllers.PersonApp.save"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.PersonApp.search"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchOne""","""controllers.PersonApp.searchOne"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithOr""","""controllers.PersonApp.searchWithOr"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithAnd""","""controllers.PersonApp.searchWithAnd"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$id<[^/]+>""","""controllers.PersonApp.change(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/$id<[^/]+>""","""controllers.PersonApp.remove(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveStudent""","""controllers.StudentApp.saveStudent"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchStudent""","""controllers.StudentApp.searchStudent"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchFirstStudent""","""controllers.StudentApp.searchFirstStudent"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithOrForStudent""","""controllers.StudentApp.searchWithOrForStudent"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithAndForStudent""","""controllers.StudentApp.searchWithAndForStudent"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateStudent/$id<[^/]+>""","""controllers.StudentApp.change(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteStudent/$id<[^/]+>""","""controllers.StudentApp.removeStudent(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_PersonApp_index0_route(params) => {
   call { 
        controllers_PersonApp_index0_invoker.call(controllers.PersonApp.index)
   }
}
        

// @LINE:7
case controllers_PersonApp_findById1_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonApp_findById1_invoker.call(controllers.PersonApp.findById(id))
   }
}
        

// @LINE:8
case controllers_StudentApp_findById2_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_StudentApp_findById2_invoker.call(controllers.StudentApp.findById(id))
   }
}
        

// @LINE:10
case controllers_PersonApp_save3_route(params) => {
   call { 
        controllers_PersonApp_save3_invoker.call(controllers.PersonApp.save)
   }
}
        

// @LINE:11
case controllers_PersonApp_search4_route(params) => {
   call { 
        controllers_PersonApp_search4_invoker.call(controllers.PersonApp.search)
   }
}
        

// @LINE:12
case controllers_PersonApp_searchOne5_route(params) => {
   call { 
        controllers_PersonApp_searchOne5_invoker.call(controllers.PersonApp.searchOne)
   }
}
        

// @LINE:13
case controllers_PersonApp_searchWithOr6_route(params) => {
   call { 
        controllers_PersonApp_searchWithOr6_invoker.call(controllers.PersonApp.searchWithOr)
   }
}
        

// @LINE:14
case controllers_PersonApp_searchWithAnd7_route(params) => {
   call { 
        controllers_PersonApp_searchWithAnd7_invoker.call(controllers.PersonApp.searchWithAnd)
   }
}
        

// @LINE:16
case controllers_PersonApp_change8_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonApp_change8_invoker.call(controllers.PersonApp.change(id))
   }
}
        

// @LINE:17
case controllers_PersonApp_remove9_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonApp_remove9_invoker.call(controllers.PersonApp.remove(id))
   }
}
        

// @LINE:19
case controllers_StudentApp_saveStudent10_route(params) => {
   call { 
        controllers_StudentApp_saveStudent10_invoker.call(controllers.StudentApp.saveStudent)
   }
}
        

// @LINE:20
case controllers_StudentApp_searchStudent11_route(params) => {
   call { 
        controllers_StudentApp_searchStudent11_invoker.call(controllers.StudentApp.searchStudent)
   }
}
        

// @LINE:21
case controllers_StudentApp_searchFirstStudent12_route(params) => {
   call { 
        controllers_StudentApp_searchFirstStudent12_invoker.call(controllers.StudentApp.searchFirstStudent)
   }
}
        

// @LINE:22
case controllers_StudentApp_searchWithOrForStudent13_route(params) => {
   call { 
        controllers_StudentApp_searchWithOrForStudent13_invoker.call(controllers.StudentApp.searchWithOrForStudent)
   }
}
        

// @LINE:23
case controllers_StudentApp_searchWithAndForStudent14_route(params) => {
   call { 
        controllers_StudentApp_searchWithAndForStudent14_invoker.call(controllers.StudentApp.searchWithAndForStudent)
   }
}
        

// @LINE:25
case controllers_StudentApp_change15_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_StudentApp_change15_invoker.call(controllers.StudentApp.change(id))
   }
}
        

// @LINE:26
case controllers_StudentApp_removeStudent16_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_StudentApp_removeStudent16_invoker.call(controllers.StudentApp.removeStudent(id))
   }
}
        

// @LINE:30
case controllers_Assets_at17_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     