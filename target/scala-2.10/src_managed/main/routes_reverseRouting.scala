// @SOURCE:/home/sam/workspace/play-mongo-dao/conf/routes
// @HASH:b787be19521f86e18c18defa1440db1aecce3bf2
// @DATE:Thu Jun 02 15:29:55 NPT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:18
class ReverseAssets {


// @LINE:18
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:25
// @LINE:22
// @LINE:15
// @LINE:12
// @LINE:9
class ReverseStudentApplication {


// @LINE:22
def searchStudentWithAnd(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchStudentWithAnd")
}
                        

// @LINE:12
def searchAllStudent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchAllStudent")
}
                        

// @LINE:15
def searchStudentWithOr(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchStudentWithOr")
}
                        

// @LINE:9
def saveStudent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveStudent")
}
                        

// @LINE:25
def searchOneStudent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchOneStudent")
}
                        

}
                          

// @LINE:31
// @LINE:29
// @LINE:24
// @LINE:21
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:6
def findById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getById/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:24
def searchOne(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchOne")
}
                        

// @LINE:14
def searchWithOr(name:String, roll:Int, monitor:Boolean): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithOr/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/" + implicitly[PathBindable[Int]].unbind("roll", roll) + "/" + implicitly[PathBindable[Boolean]].unbind("monitor", monitor))
}
                        

// @LINE:31
def remove(id:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "delete/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:8
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "save")
}
                        

// @LINE:11
def search(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:21
def searchWithAnd(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithAnd")
}
                        

// @LINE:29
def change(id:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

}
                          
}
                  


// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:18
class ReverseAssets {


// @LINE:18
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:22
// @LINE:15
// @LINE:12
// @LINE:9
class ReverseStudentApplication {


// @LINE:22
def searchStudentWithAnd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApplication.searchStudentWithAnd",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchStudentWithAnd"})
      }
   """
)
                        

// @LINE:12
def searchAllStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApplication.searchAllStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchAllStudent"})
      }
   """
)
                        

// @LINE:15
def searchStudentWithOr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApplication.searchStudentWithOr",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchStudentWithOr"})
      }
   """
)
                        

// @LINE:9
def saveStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApplication.saveStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveStudent"})
      }
   """
)
                        

// @LINE:25
def searchOneStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApplication.searchOneStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchOneStudent"})
      }
   """
)
                        

}
              

// @LINE:31
// @LINE:29
// @LINE:24
// @LINE:21
// @LINE:14
// @LINE:11
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
                        

// @LINE:24
def searchOne : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchOne",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchOne"})
      }
   """
)
                        

// @LINE:14
def searchWithOr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchWithOr",
   """
      function(name,roll,monitor) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithOr/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("roll", roll) + "/" + (""" + implicitly[PathBindable[Boolean]].javascriptUnbind + """)("monitor", monitor)})
      }
   """
)
                        

// @LINE:31
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
                        

// @LINE:11
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:21
def searchWithAnd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchWithAnd",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithAnd"})
      }
   """
)
                        

// @LINE:29
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
        


// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:18
class ReverseAssets {


// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:25
// @LINE:22
// @LINE:15
// @LINE:12
// @LINE:9
class ReverseStudentApplication {


// @LINE:22
def searchStudentWithAnd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApplication.searchStudentWithAnd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchStudentWithAnd", Seq(), "GET", """""", _prefix + """searchStudentWithAnd""")
)
                      

// @LINE:12
def searchAllStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApplication.searchAllStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchAllStudent", Seq(), "POST", """""", _prefix + """searchAllStudent""")
)
                      

// @LINE:15
def searchStudentWithOr(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApplication.searchStudentWithOr(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchStudentWithOr", Seq(), "GET", """""", _prefix + """searchStudentWithOr""")
)
                      

// @LINE:9
def saveStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApplication.saveStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "saveStudent", Seq(), "POST", """""", _prefix + """saveStudent""")
)
                      

// @LINE:25
def searchOneStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApplication.searchOneStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApplication", "searchOneStudent", Seq(), "POST", """""", _prefix + """searchOneStudent""")
)
                      

}
                          

// @LINE:31
// @LINE:29
// @LINE:24
// @LINE:21
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:6
def findById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findById", Seq(classOf[String]), "GET", """ Home page
GET           /                                         controllers.Application.index""", _prefix + """getById/$id<[^/]+>""")
)
                      

// @LINE:24
def searchOne(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchOne(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchOne", Seq(), "POST", """""", _prefix + """searchOne""")
)
                      

// @LINE:14
def searchWithOr(name:String, roll:Int, monitor:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchWithOr(name, roll, monitor), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithOr", Seq(classOf[String], classOf[Int], classOf[Boolean]), "GET", """""", _prefix + """searchWithOr/$name<[^/]+>/$roll<[^/]+>/$monitor<[^/]+>""")
)
                      

// @LINE:31
def remove(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.remove(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remove", Seq(classOf[String]), "DELETE", """""", _prefix + """delete/$id<[^/]+>""")
)
                      

// @LINE:8
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "save", Seq(), "POST", """/getById/5489ba79b5f1442bdb9fd25e""", _prefix + """save""")
)
                      

// @LINE:11
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:21
def searchWithAnd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchWithAnd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchWithAnd", Seq(), "GET", """GET         /showQuery                                 controllers.Application.showQuery""", _prefix + """searchWithAnd""")
)
                      

// @LINE:29
def change(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.change(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "change", Seq(classOf[String]), "PUT", """""", _prefix + """update/$id<[^/]+>""")
)
                      

}
                          
}
        
    