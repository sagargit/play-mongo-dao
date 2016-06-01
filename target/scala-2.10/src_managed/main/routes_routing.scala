// @SOURCE:/home/sam/workspace/play-mongo-dao/conf/routes
// @HASH:d355c9c8949ea1a16f12e92c931d7b3f9ec7a6f1
// @DATE:Wed Jun 01 10:48:43 NPT 2016


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
private[this] lazy val controllers_Application_search2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Application_search2_invoker = createInvoker(
controllers.Application.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Nil,"POST", """""", Routes.prefix + """search"""))
        

// @LINE:10
private[this] lazy val controllers_Application_searchWithOr3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithOr/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"),DynamicPart("roll", """[^/]+""",true),StaticPart("/"),DynamicPart("monitor", """[^/]+""",true))))
private[this] lazy val controllers_Application_searchWithOr3_invoker = createInvoker(
controllers.Application.searchWithOr(fakeValue[String], fakeValue[Int], fakeValue[Boolean]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithOr", Seq(classOf[String], classOf[Int], classOf[Boolean]),"GET", """""", Routes.prefix + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:15
private[this] lazy val controllers_Application_searchWithAnd5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchWithAnd"))))
private[this] lazy val controllers_Application_searchWithAnd5_invoker = createInvoker(
controllers.Application.searchWithAnd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithAnd", Nil,"GET", """GET         /showQuery                                 controllers.Application.showQuery""", Routes.prefix + """searchWithAnd"""))
        

// @LINE:16
private[this] lazy val controllers_Application_searchOne6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchOne"))))
private[this] lazy val controllers_Application_searchOne6_invoker = createInvoker(
controllers.Application.searchOne,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchOne", Nil,"POST", """""", Routes.prefix + """searchOne"""))
        

// @LINE:20
private[this] lazy val controllers_Application_change7_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_change7_invoker = createInvoker(
controllers.Application.change(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "change", Seq(classOf[String]),"PUT", """""", Routes.prefix + """update/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_Application_remove8_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_remove8_invoker = createInvoker(
controllers.Application.remove(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remove", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """delete/$id<[^/]+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getById/$id<[^/]+>""","""controllers.Application.findById(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """save""","""controllers.Application.save"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>""","""controllers.Application.searchWithOr(name:String, roll:Int, monitor:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchWithAnd""","""controllers.Application.searchWithAnd"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchOne""","""controllers.Application.searchOne"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$id<[^/]+>""","""controllers.Application.change(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/$id<[^/]+>""","""controllers.Application.remove(id:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_search2_route(params) => {
   call { 
        controllers_Application_search2_invoker.call(controllers.Application.search)
   }
}
        

// @LINE:10
case controllers_Application_searchWithOr3_route(params) => {
   call(params.fromPath[String]("name", None), params.fromPath[Int]("roll", None), params.fromPath[Boolean]("monitor", None)) { (name, roll, monitor) =>
        controllers_Application_searchWithOr3_invoker.call(controllers.Application.searchWithOr(name, roll, monitor))
   }
}
        

// @LINE:12
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:15
case controllers_Application_searchWithAnd5_route(params) => {
   call { 
        controllers_Application_searchWithAnd5_invoker.call(controllers.Application.searchWithAnd)
   }
}
        

// @LINE:16
case controllers_Application_searchOne6_route(params) => {
   call { 
        controllers_Application_searchOne6_invoker.call(controllers.Application.searchOne)
   }
}
        

// @LINE:20
case controllers_Application_change7_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_change7_invoker.call(controllers.Application.change(id))
   }
}
        

// @LINE:22
case controllers_Application_remove8_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_remove8_invoker.call(controllers.Application.remove(id))
   }
}
        
}

}
     