// @SOURCE:/home/srijesh/dev/projects/play-mongo-dao/conf/routes
// @HASH:8e4df60a9f24034985f65d173a86331ecd8961da
// @DATE:Thu Jun 02 16:25:12 NPT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
class ReversePersonApp {


// @LINE:7
def findById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getById/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:13
def searchWithOr(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithOr")
}
                        

// @LINE:12
def searchOne(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchOne")
}
                        

// @LINE:17
def remove(id:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "delete/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:10
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "save")
}
                        

// @LINE:11
def search(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:14
def searchWithAnd(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithAnd")
}
                        

// @LINE:16
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
                          

// @LINE:30
class ReverseAssets {


// @LINE:30
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:8
class ReverseStudentApp {


// @LINE:8
def findById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getByStudentId/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:20
def searchStudent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchStudent")
}
                        

// @LINE:19
def saveStudent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveStudent")
}
                        

// @LINE:21
def searchFirstStudent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchFirstStudent")
}
                        

// @LINE:25
def change(id:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "updateStudent/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:22
def searchWithOrForStudent(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithOrForStudent")
}
                        

// @LINE:23
def searchWithAndForStudent(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchWithAndForStudent")
}
                        

// @LINE:26
def removeStudent(id:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "deleteStudent/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

}
                          
}
                  


// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
class ReversePersonApp {


// @LINE:7
def findById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.findById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getById/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:13
def searchWithOr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.searchWithOr",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithOr"})
      }
   """
)
                        

// @LINE:12
def searchOne : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.searchOne",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchOne"})
      }
   """
)
                        

// @LINE:17
def remove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.remove",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:10
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "save"})
      }
   """
)
                        

// @LINE:11
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:14
def searchWithAnd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.searchWithAnd",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithAnd"})
      }
   """
)
                        

// @LINE:16
def change : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.change",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonApp.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:30
class ReverseAssets {


// @LINE:30
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:8
class ReverseStudentApp {


// @LINE:8
def findById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.findById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getByStudentId/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:20
def searchStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.searchStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchStudent"})
      }
   """
)
                        

// @LINE:19
def saveStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.saveStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveStudent"})
      }
   """
)
                        

// @LINE:21
def searchFirstStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.searchFirstStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchFirstStudent"})
      }
   """
)
                        

// @LINE:25
def change : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.change",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "updateStudent/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:22
def searchWithOrForStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.searchWithOrForStudent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithOrForStudent"})
      }
   """
)
                        

// @LINE:23
def searchWithAndForStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.searchWithAndForStudent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchWithAndForStudent"})
      }
   """
)
                        

// @LINE:26
def removeStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentApp.removeStudent",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteStudent/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

}
              
}
        


// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
class ReversePersonApp {


// @LINE:7
def findById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.findById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "findById", Seq(classOf[String]), "GET", """""", _prefix + """getById/$id<[^/]+>""")
)
                      

// @LINE:13
def searchWithOr(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.searchWithOr(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "searchWithOr", Seq(), "GET", """""", _prefix + """searchWithOr""")
)
                      

// @LINE:12
def searchOne(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.searchOne(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "searchOne", Seq(), "POST", """""", _prefix + """searchOne""")
)
                      

// @LINE:17
def remove(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.remove(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "remove", Seq(classOf[String]), "DELETE", """""", _prefix + """delete/$id<[^/]+>""")
)
                      

// @LINE:10
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "save", Seq(), "POST", """/getById/5489ba79b5f1442bdb9fd25e""", _prefix + """save""")
)
                      

// @LINE:11
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:14
def searchWithAnd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.searchWithAnd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "searchWithAnd", Seq(), "GET", """""", _prefix + """searchWithAnd""")
)
                      

// @LINE:16
def change(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.change(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "change", Seq(classOf[String]), "PUT", """GET          /searchWithOr/:name/:roll/:monitor        controllers.Application.searchWithOr(name:Option[String],roll:Option[BigDecimal],monitor:Option[Boolean])""", _prefix + """update/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonApp.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonApp", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:30
class ReverseAssets {


// @LINE:30
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:8
class ReverseStudentApp {


// @LINE:8
def findById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.findById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "findById", Seq(classOf[String]), "GET", """""", _prefix + """getByStudentId/$id<[^/]+>""")
)
                      

// @LINE:20
def searchStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.searchStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchStudent", Seq(), "POST", """""", _prefix + """searchStudent""")
)
                      

// @LINE:19
def saveStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.saveStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "saveStudent", Seq(), "POST", """Students""", _prefix + """saveStudent""")
)
                      

// @LINE:21
def searchFirstStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.searchFirstStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchFirstStudent", Seq(), "POST", """""", _prefix + """searchFirstStudent""")
)
                      

// @LINE:25
def change(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.change(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "change", Seq(classOf[String]), "PUT", """GET          /searchWithAndPerson/:name/:roll/:monitor  controllers.Application.searchWithAndPerson(name:String,roll:Int,monitor:Boolean)""", _prefix + """updateStudent/$id<[^/]+>""")
)
                      

// @LINE:22
def searchWithOrForStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.searchWithOrForStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchWithOrForStudent", Seq(), "GET", """""", _prefix + """searchWithOrForStudent""")
)
                      

// @LINE:23
def searchWithAndForStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.searchWithAndForStudent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "searchWithAndForStudent", Seq(), "GET", """""", _prefix + """searchWithAndForStudent""")
)
                      

// @LINE:26
def removeStudent(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentApp.removeStudent(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.StudentApp", "removeStudent", Seq(classOf[String]), "DELETE", """""", _prefix + """deleteStudent/$id<[^/]+>""")
)
                      

}
                          
}
        
    