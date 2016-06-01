
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Play with Reactive Mongo")/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<!-- Begin page content -->
    <div class="container">
        <div class="page-header">
            <h1>Sticky footer with fixed navbar</h1>
        </div>
    </div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 31 17:52:02 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/play-mongo-dao/app/views/index.scala.html
                  HASH: 8752fd4492b6fad6589092597f951ed537b1730c
                  MATRIX: 505->1|610->18|638->21|678->53|716->54|747->59
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4
                  -- GENERATED --
              */
          