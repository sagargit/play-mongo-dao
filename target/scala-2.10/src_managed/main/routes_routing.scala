// @SOURCE:/home/sam/workspace/play-mongo-dao/conf/routes
// @HASH:b787be19521f86e18c18defa1440db1aecce3bf2
// @DATE:Thu Jun 02 15:29:55 NPT 2016


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
private[this] lazy val controllers_Application_findById0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_findById0_invoker = createInvoker(
controllers.Application.findById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findById", Seq(classOf[String]),"GET", """ Home page
GET           /                                         controllers.Application.index""", Routes.prefix + """getById/$id<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_save1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("save"))))
private[this] lazy val controllers_Application_save1_invoker = createInvoker(
controllers.Application.save,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "save", Nil,"POST", """/getById/5489ba79b5f1442bdb9fd25e""", Routes.prefix + """save"""))
        

// @LINE:9
private[this] lazy val controllers_StudentApplication_saveStudent2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveStudent"))))
private[this] lazy val controllers_StudentApplication_saveStudent2_invoker = createInvoker(
controllers.StudentApplication.saveStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "saveStudent", Nil,"POST", """""", Routes.prefix + """saveStudent"""))
        

// @LINE:11
private[this] lazy val controllers_Application_search3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Application_search3_invoker = createInvoker(
controllers.Application.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Nil,"POST", """""", Routes.prefix + """search"""))
        

// @LINE:12
private[this] lazy val controllers_StudentApplication_searchAllStudent4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchAllStudent"))))
private[this] lazy val controllers_StudentApplication_searchAllStudent4_invoker = createInvoker(
controllers.StudentApplication.searchAllStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchAllStudent", Nil,"POST", """""", Routes.prefix + """searchAllStudent"""))
        

// @LINE:14
private[this] lazy val controllers_Application_searchWithOr5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithOr/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"),DynamicPart("roll", """[^/]+""",true),StaticPart("/"),DynamicPart("monitor", """[^/]+""",true))))
private[this] lazy val controllers_Application_searchWithOr5_invoker = createInvoker(
controllers.Application.searchWithOr(fakeValue[String], fakeValue[Int], fakeValue[Boolean]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithOr", Seq(classOf[String], classOf[Int], classOf[Boolean]),"GET", """""", Routes.prefix + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_StudentApplication_searchStudentWithOr6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchStudentWithOr"))))
private[this] lazy val controllers_StudentApplication_searchStudentWithOr6_invoker = createInvoker(
controllers.StudentApplication.searchStudentWithOr,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchStudentWithOr", Nil,"GET", """""", Routes.prefix + """searchStudentWithOr"""))
        

// @LINE:18
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:21
private[this] lazy val controllers_Application_searchWithAnd8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithAnd"))))
private[this] lazy val controllers_Application_searchWithAnd8_invoker = createInvoker(
controllers.Application.searchWithAnd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithAnd", Nil,"GET", """GET         /showQuery                                 controllers.Application.showQuery""", Routes.prefix + """searchWithAnd"""))
        

// @LINE:22
private[this] lazy val controllers_StudentApplication_searchStudentWithAnd9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchStudentWithAnd"))))
private[this] lazy val controllers_StudentApplication_searchStudentWithAnd9_invoker = createInvoker(
controllers.StudentApplication.searchStudentWithAnd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchStudentWithAnd", Nil,"GET", """""", Routes.prefix + """searchStudentWithAnd"""))
        

// @LINE:24
private[this] lazy val controllers_Application_searchOne10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchOne"))))
private[this] lazy val controllers_Application_searchOne10_invoker = createInvoker(
controllers.Application.searchOne,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchOne", Nil,"POST", """""", Routes.prefix + """searchOne"""))
        

// @LINE:25
private[this] lazy val controllers_StudentApplication_searchOneStudent11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchOneStudent"))))
private[this] lazy val controllers_StudentApplication_searchOneStudent11_invoker = createInvoker(
controllers.StudentApplication.searchOneStudent,
HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchOneStudent", Nil,"POST", """""", Routes.prefix + """searchOneStudent"""))
        

// @LINE:29
private[this] lazy val controllers_Application_change12_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_change12_invoker = createInvoker(
controllers.Application.change(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "change", Seq(classOf[String]),"PUT", """""", Routes.prefix + """update/$id<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_Application_remove13_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_remove13_invoker = createInvoker(
controllers.Application.remove(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remove", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """delete/$id<[^/]+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getById/$id<[^/]+>""","""controllers.Application.findById(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """save""","""controllers.Application.save"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveStudent""","""controllers.StudentApplication.saveStudent"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchAllStudent""","""controllers.StudentApplication.searchAllStudent"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>""","""controllers.Application.searchWithOr(name:String, roll:Int, monitor:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchStudentWithOr""","""controllers.StudentApplication.searchStudentWithOr"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithAnd""","""controllers.Application.searchWithAnd"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchStudentWithAnd""","""controllers.StudentApplication.searchStudentWithAnd"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchOne""","""controllers.Application.searchOne"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchOneStudent""","""controllers.StudentApplication.searchOneStudent"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$id<[^/]+>""","""controllers.Application.change(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/$id<[^/]+>""","""controllers.Application.remove(id:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_findById0_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_findById0_invoker.call(controllers.Application.findById(id))
   }
}
        

// @LINE:8
case controllers_Application_save1_route(params) => {
   call { 
        controllers_Application_save1_invoker.call(controllers.Application.save)
   }
}
        

// @LINE:9
case controllers_StudentApplication_saveStudent2_route(params) => {
   call { 
        controllers_StudentApplication_saveStudent2_invoker.call(controllers.StudentApplication.saveStudent)
   }
}
        

// @LINE:11
case controllers_Application_search3_route(params) => {
   call { 
        controllers_Application_search3_invoker.call(controllers.Application.search)
   }
}
        

// @LINE:12
case controllers_StudentApplication_searchAllStudent4_route(params) => {
   call { 
        controllers_StudentApplication_searchAllStudent4_invoker.call(controllers.StudentApplication.searchAllStudent)
   }
}
        

// @LINE:14
case controllers_Application_searchWithOr5_route(params) => {
   call(params.fromPath[String]("name", None), params.fromPath[Int]("roll", None), params.fromPath[Boolean]("monitor", None)) { (name, roll, monitor) =>
        controllers_Application_searchWithOr5_invoker.call(controllers.Application.searchWithOr(name, roll, monitor))
   }
}
        

// @LINE:15
case controllers_StudentApplication_searchStudentWithOr6_route(params) => {
   call { 
        controllers_StudentApplication_searchStudentWithOr6_invoker.call(controllers.StudentApplication.searchStudentWithOr)
   }
}
        

// @LINE:18
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:21
case controllers_Application_searchWithAnd8_route(params) => {
   call { 
        controllers_Application_searchWithAnd8_invoker.call(controllers.Application.searchWithAnd)
   }
}
        

// @LINE:22
case controllers_StudentApplication_searchStudentWithAnd9_route(params) => {
   call { 
        controllers_StudentApplication_searchStudentWithAnd9_invoker.call(controllers.StudentApplication.searchStudentWithAnd)
   }
}
        

// @LINE:24
case controllers_Application_searchOne10_route(params) => {
   call { 
        controllers_Application_searchOne10_invoker.call(controllers.Application.searchOne)
   }
}
        

// @LINE:25
case controllers_StudentApplication_searchOneStudent11_route(params) => {
   call { 
        controllers_StudentApplication_searchOneStudent11_invoker.call(controllers.StudentApplication.searchOneStudent)
   }
}
        

// @LINE:29
case controllers_Application_change12_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_change12_invoker.call(controllers.Application.change(id))
   }
}
        

// @LINE:31
case controllers_Application_remove13_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_remove13_invoker.call(controllers.Application.remove(id))
   }
}
        
}

}
     