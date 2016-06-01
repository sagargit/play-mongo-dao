// @SOURCE:/home/srijesh/dev/projects/play-mongo-dao/conf/routes
// @HASH:914fff6b5f0574ae5b9f1dbe743d35989507e21d
// @DATE:Tue May 31 17:52:00 NPT 2016


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
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_findById1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_findById1_invoker = createInvoker(
controllers.Application.findById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findById", Seq(classOf[String]),"GET", """""", Routes.prefix + """getById/$id<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_save2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("save"))))
private[this] lazy val controllers_Application_save2_invoker = createInvoker(
controllers.Application.save,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "save", Nil,"POST", """/getById/5489ba79b5f1442bdb9fd25e""", Routes.prefix + """save"""))
        

// @LINE:10
private[this] lazy val controllers_Application_search3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Application_search3_invoker = createInvoker(
controllers.Application.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Nil,"POST", """""", Routes.prefix + """search"""))
        

// @LINE:11
private[this] lazy val controllers_Application_searchWithOr4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithOr/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"),DynamicPart("roll", """[^/]+""",true),StaticPart("/"),DynamicPart("monitor", """[^/]+""",true))))
private[this] lazy val controllers_Application_searchWithOr4_invoker = createInvoker(
controllers.Application.searchWithOr(fakeValue[String], fakeValue[Int], fakeValue[Boolean]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithOr", Seq(classOf[String], classOf[Int], classOf[Boolean]),"GET", """""", Routes.prefix + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:16
private[this] lazy val controllers_Application_searchWithAnd6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithAnd"))))
private[this] lazy val controllers_Application_searchWithAnd6_invoker = createInvoker(
controllers.Application.searchWithAnd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithAnd", Nil,"GET", """GET         /showQuery                                 controllers.Application.showQuery""", Routes.prefix + """searchWithAnd"""))
        

// @LINE:17
private[this] lazy val controllers_Application_searchOne7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchOne"))))
private[this] lazy val controllers_Application_searchOne7_invoker = createInvoker(
controllers.Application.searchOne,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchOne", Nil,"POST", """""", Routes.prefix + """searchOne"""))
        

// @LINE:21
private[this] lazy val controllers_Application_change8_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_change8_invoker = createInvoker(
controllers.Application.change(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "change", Seq(classOf[String]),"PUT", """""", Routes.prefix + """update/$id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_Application_remove9_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_remove9_invoker = createInvoker(
controllers.Application.remove(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remove", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """delete/$id<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getById/$id<[^/]+>""","""controllers.Application.findById(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """save""","""controllers.Application.save"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>""","""controllers.Application.searchWithOr(name:String, roll:Int, monitor:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithAnd""","""controllers.Application.searchWithAnd"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchOne""","""controllers.Application.searchOne"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$id<[^/]+>""","""controllers.Application.change(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/$id<[^/]+>""","""controllers.Application.remove(id:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_findById1_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_findById1_invoker.call(controllers.Application.findById(id))
   }
}
        

// @LINE:9
case controllers_Application_save2_route(params) => {
   call { 
        controllers_Application_save2_invoker.call(controllers.Application.save)
   }
}
        

// @LINE:10
case controllers_Application_search3_route(params) => {
   call { 
        controllers_Application_search3_invoker.call(controllers.Application.search)
   }
}
        

// @LINE:11
case controllers_Application_searchWithOr4_route(params) => {
   call(params.fromPath[String]("name", None), params.fromPath[Int]("roll", None), params.fromPath[Boolean]("monitor", None)) { (name, roll, monitor) =>
        controllers_Application_searchWithOr4_invoker.call(controllers.Application.searchWithOr(name, roll, monitor))
   }
}
        

// @LINE:13
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:16
case controllers_Application_searchWithAnd6_route(params) => {
   call { 
        controllers_Application_searchWithAnd6_invoker.call(controllers.Application.searchWithAnd)
   }
}
        

// @LINE:17
case controllers_Application_searchOne7_route(params) => {
   call { 
        controllers_Application_searchOne7_invoker.call(controllers.Application.searchOne)
   }
}
        

// @LINE:21
case controllers_Application_change8_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_change8_invoker.call(controllers.Application.change(id))
   }
}
        

// @LINE:23
case controllers_Application_remove9_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_remove9_invoker.call(controllers.Application.remove(id))
   }
}
        
}

}
     