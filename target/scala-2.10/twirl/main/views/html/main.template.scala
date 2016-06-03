
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
  </head>
  <body>
  """),_display_(/*8.4*/content),format.raw/*8.11*/("""
  """),format.raw/*9.3*/("""</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 11:22:22 NPT 2016
                  SOURCE: /home/sam/workspace/play-mongo-dao/app/views/main.scala.html
                  HASH: d956ffd30fe663fc25dca2262057d33183946d24
                  MATRIX: 509->1|627->31|654->32|724->76|749->81|805->112|832->119|861->122
                  LINES: 19->1|22->1|23->2|26->5|26->5|29->8|29->8|30->9
                  -- GENERATED --
              */
          