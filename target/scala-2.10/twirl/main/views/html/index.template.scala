
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Play with Reactive Mongo")/*1.34*/{_display_(Seq[Any](format.raw/*1.35*/("""
  """),format.raw/*2.3*/("""<!-- Begin page content -->
  <div class="container">
    <div class="page-header">
      <h1>Sticky footer with fixed navbar</h1>
    </div>
  </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 11:22:22 NPT 2016
                  SOURCE: /home/sam/workspace/play-mongo-dao/app/views/index.scala.html
                  HASH: 76e5a5439cf00b6d0d776e58736c2c9354ab2297
                  MATRIX: 580->1|620->33|658->34|687->37
                  LINES: 22->1|22->1|22->1|23->2
                  -- GENERATED --
              */
          