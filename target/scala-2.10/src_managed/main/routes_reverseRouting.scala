// @SOURCE:/home/srijesh/dev/projects/play-mongo-dao/conf/routes
// @HASH:914fff6b5f0574ae5b9f1dbe743d35989507e21d
// @DATE:Tue May 31 17:52:00 NPT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:23
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {


// @LINE:13
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:23
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def findById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getById/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:17
def searchOne(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchOne")
}
                        

// @LINE:11
def searchWithOr(name:String, roll:Int, monitor:Boolean): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithOr/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/" + implicitly[PathBindable[Int]].unbind("roll", roll) + "/" + implicitly[PathBindable[Boolean]].unbind("monitor", monitor))
}
                        

// @LINE:23
def remove(id:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "delete/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:9
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "save")
}
                        

// @LINE:10
def search(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:16
def searchWithAnd(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithAnd")
}
                        

// @LINE:21
def change(id:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:23
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
class ReverseAssets {


// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:23
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def findById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.findById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getById/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:17
def searchOne : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchOne",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchOne"})
      }
   """
)
                        

// @LINE:11
def searchWithOr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchWithOr",
   """
      function(name,roll,monitor) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithOr/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("roll", roll) + "/" + (""" + implicitly[PathBindable[Boolean]].javascriptUnbind + """)("monitor", monitor)})
      }
   """
)
                        

// @LINE:23
def remove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.remove",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:9
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "save"})
      }
   """
)
                        

// @LINE:10
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:16
def searchWithAnd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchWithAnd",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithAnd"})
      }
   """
)
                        

// @LINE:21
def change : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.change",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:23
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {


// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:23
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def findById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findById", Seq(classOf[String]), "GET", """""", _prefix + """getById/$id<[^/]+>""")
)
                      

// @LINE:17
def searchOne(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchOne(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchOne", Seq(), "POST", """""", _prefix + """searchOne""")
)
                      

// @LINE:11
def searchWithOr(name:String, roll:Int, monitor:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchWithOr(name, roll, monitor), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithOr", Seq(classOf[String], classOf[Int], classOf[Boolean]), "GET", """""", _prefix + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>""")
)
                      

// @LINE:23
def remove(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.remove(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remove", Seq(classOf[String]), "DELETE", """""", _prefix + """delete/$id<[^/]+>""")
)
                      

// @LINE:9
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "save", Seq(), "POST", """/getById/5489ba79b5f1442bdb9fd25e""", _prefix + """save""")
)
                      

// @LINE:10
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:16
def searchWithAnd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchWithAnd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithAnd", Seq(), "GET", """GET         /showQuery                                 controllers.Application.showQuery""", _prefix + """searchWithAnd""")
)
                      

// @LINE:21
def change(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.change(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "change", Seq(classOf[String]), "PUT", """""", _prefix + """update/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    