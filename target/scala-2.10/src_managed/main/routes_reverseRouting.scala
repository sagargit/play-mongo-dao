// @SOURCE:/home/sam/workspace/play-mongo-dao/conf/routes
// @HASH:d355c9c8949ea1a16f12e92c931d7b3f9ec7a6f1
// @DATE:Wed Jun 01 10:48:43 NPT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:12
class ReverseAssets {


// @LINE:12
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:6
def findById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getById/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:16
def searchOne(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchOne")
}
                        

// @LINE:10
def searchWithOr(name:String, roll:Int, monitor:Boolean): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithOr/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/" + implicitly[PathBindable[Int]].unbind("roll", roll) + "/" + implicitly[PathBindable[Boolean]].unbind("monitor", monitor))
}
                        

// @LINE:22
def remove(id:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "delete/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:8
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "save")
}
                        

// @LINE:9
def search(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:15
def searchWithAnd(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithAnd")
}
                        

// @LINE:20
def change(id:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:12
class ReverseAssets {


// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:6
def findById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.findById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getById/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:16
def searchOne : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchOne",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchOne"})
      }
   """
)
                        

// @LINE:10
def searchWithOr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchWithOr",
   """
      function(name,roll,monitor) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithOr/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("roll", roll) + "/" + (""" + implicitly[PathBindable[Boolean]].javascriptUnbind + """)("monitor", monitor)})
      }
   """
)
                        

// @LINE:22
def remove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.remove",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:8
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "save"})
      }
   """
)
                        

// @LINE:9
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:15
def searchWithAnd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchWithAnd",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithAnd"})
      }
   """
)
                        

// @LINE:20
def change : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.change",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:12
class ReverseAssets {


// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:6
def findById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findById", Seq(classOf[String]), "GET", """ Home page
GET           /                                         controllers.Application.index""", _prefix + """getById/$id<[^/]+>""")
)
                      

// @LINE:16
def searchOne(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchOne(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchOne", Seq(), "POST", """""", _prefix + """searchOne""")
)
                      

// @LINE:10
def searchWithOr(name:String, roll:Int, monitor:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchWithOr(name, roll, monitor), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithOr", Seq(classOf[String], classOf[Int], classOf[Boolean]), "GET", """""", _prefix + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>""")
)
                      

// @LINE:22
def remove(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.remove(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remove", Seq(classOf[String]), "DELETE", """""", _prefix + """delete/$id<[^/]+>""")
)
                      

// @LINE:8
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "save", Seq(), "POST", """/getById/5489ba79b5f1442bdb9fd25e""", _prefix + """save""")
)
                      

// @LINE:9
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:15
def searchWithAnd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchWithAnd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithAnd", Seq(), "GET", """GET         /showQuery                                 controllers.Application.showQuery""", _prefix + """searchWithAnd""")
)
                      

// @LINE:20
def change(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.change(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "change", Seq(classOf[String]), "PUT", """""", _prefix + """update/$id<[^/]+>""")
)
                      

}
                          
}
        
    