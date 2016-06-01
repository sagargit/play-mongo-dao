
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
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
    </head>
    <body>
        """),_display_(/*8.10*/content),format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 31 17:52:02 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/play-mongo-dao/app/views/main.scala.html
                  HASH: 797af2948740b77a5d6afcd7ba3f8687902ca884
                  MATRIX: 509->1|627->31|654->32|730->82|755->87|822->128|849->135|880->140
                  LINES: 19->1|22->1|23->2|26->5|26->5|29->8|29->8|30->9
                  -- GENERATED --
              */
          