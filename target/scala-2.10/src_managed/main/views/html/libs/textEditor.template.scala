
package views.html.libs

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object textEditor extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="text-editor-container">
    <div class="btn-toolbar" data-role="editor-toolbar" data-target="#editor">
        <div class="btn-group btn-group-sm">
            <a type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" data-original-title="Font">
                <span class="glyphicon glyphicon-font"></span>
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a data-edit="fontName Serif" style="font-family:'Serif'">Serif</a></li><li><a data-edit="fontName Sans" style="font-family:'Sans'">Sans</a></li><li><a data-edit="fontName Arial" style="font-family:'Arial'">Arial</a></li><li><a data-edit="fontName Arial Black" style="font-family:'Arial Black'">Arial Black</a></li><li><a data-edit="fontName Courier" style="font-family:'Courier'">Courier</a></li><li><a data-edit="fontName Courier New" style="font-family:'Courier New'">Courier New</a></li><li><a data-edit="fontName Comic Sans MS" style="font-family:'Comic Sans MS'">Comic Sans MS</a></li><li><a data-edit="fontName Helvetica" style="font-family:'Helvetica'">Helvetica</a></li><li><a data-edit="fontName Impact" style="font-family:'Impact'">Impact</a></li><li><a data-edit="fontName Lucida Grande" style="font-family:'Lucida Grande'">Lucida Grande</a></li><li><a data-edit="fontName Lucida Sans" style="font-family:'Lucida Sans'">Lucida Sans</a></li><li><a data-edit="fontName Tahoma" style="font-family:'Tahoma'">Tahoma</a></li><li><a data-edit="fontName Times" style="font-family:'Times'">Times</a></li><li><a data-edit="fontName Times New Roman" style="font-family:'Times New Roman'">Times New Roman</a></li><li><a data-edit="fontName Verdana" style="font-family:'Verdana'">Verdana</a></li></ul>
        </div>
        <div class="btn-group btn-group-sm">
            <a type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" data-original-title="Font Size">
                <span class="glyphicon glyphicon-text-height"></span>&nbsp;
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a data-edit="fontSize 5"><font size="5">Huge</font></a></li>
                <li><a data-edit="fontSize 3"><font size="3">Normal</font></a></li>
                <li><a data-edit="fontSize 1"><font size="1">Small</font></a></li>
            </ul>
        </div>
        <div class="btn-group">
            <a class="btn btn-default" data-edit="bold" title="" data-original-title="Bold (Ctrl/Cmd+B)">
                <span class="glyphicon glyphicon-bold"></span>
            </a>
            <a type="button" class="btn btn-default" data-edit="italic" title="" data-original-title="Italic (Ctrl/Cmd+I)">
                <span class="glyphicon glyphicon-italic"></span>
            </a>
        </div>
        <div class="btn-group btn-group-sm">
            <a type="button" class="btn btn-default" data-edit="insertunorderedlist" title="" data-original-title="Bullet list"><span class="glyphicon glyphicon-list"></span></a>
            <a type="button" class="btn btn-default" data-edit="insertorderedlist" title="" data-original-title="Number list"><span class="glyphicon glyphicon-list-alt"></span></a>
            <a type="button" class="btn btn-default" data-edit="outdent" title="" data-original-title="Reduce indent (Shift+Tab)"><span class="glyphicon glyphicon-indent-left"></span></a>
            <a type="button" class="btn btn-default" data-edit="indent" title="" data-original-title="Indent (Tab)"><span class="glyphicon glyphicon-indent-right"></span></a>
        </div>
        <div class="btn-group btn-group-sm">
            <a type="button" class="btn btn-default" data-edit="justifyleft" title="" data-original-title="Align Left (Ctrl/Cmd+L)"><span class="glyphicon glyphicon-align-left"></span></a>
            <a type="button" class="btn btn-default" data-edit="justifycenter" title="" data-original-title="Center (Ctrl/Cmd+E)"><span class="glyphicon glyphicon-align-center"></span></a>
            <a type="button" class="btn btn-default" data-edit="justifyright" title="" data-original-title="Align Right (Ctrl/Cmd+R)"><span class="glyphicon glyphicon-align-right"></span></a>
            <a type="button" class="btn btn-default" data-edit="justifyfull" title="" data-original-title="Justify (Ctrl/Cmd+J)"><span class="glyphicon glyphicon-align-justify"></span></a>
        </div>
        <div class="btn-group btn-group-sm">
            <a type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" title="" data-original-title="Hyperlink"><span class="glyphicon glyphicon-link"></span></a>
            <div class="dropdown-menu input-append">
                <input class="span2" placeholder="URL" type="text" data-edit="createLink">
                <button class="btn" type="button">Add</button>
            </div>
            <a type="button" class="btn btn-default dropdown-toggle" data-edit="unlink" title="" data-original-title="Remove Hyperlink"><span class="glyphicon glyphicon-cutlery"></span></a>
        </div>
        <div class="btn-group btn-group-sm">
            <a class="btn btn-default" title="" id="pictureBtn" data-original-title="Insert picture (or just drag &amp; drop)"><span class="glyphicon glyphicon-picture"></span></a>
            <input type="file" data-role="magic-overlay" data-target="#pictureBtn" data-edit="insertImage" style="opacity: 0; position: absolute; top: 0px; left: 0px; width: 37px; height: 30px;">
        </div>
        <div class="btn-group btn-group-sm">
            <a class="btn btn-default" data-edit="undo" title="" data-original-title="Undo (Ctrl/Cmd+Z)"><span class="glyphicon glyphicon-arrow-left"></span></a>
            <a class="btn btn-default" data-edit="redo" title="" data-original-title="Redo (Ctrl/Cmd+Y)"><span class="glyphicon glyphicon-arrow-right"></span></a>
        </div>
    </div>
    <div id="editor" contenteditable="true"></div>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 27 16:25:41 MSK 2013
                    SOURCE: D:/projects/gta5/app/views/libs/textEditor.scala.html
                    HASH: 4d5596f2a11b806ac66fd88522b02aea434569ba
                    MATRIX: 647->0
                    LINES: 22->1
                    -- GENERATED --
                */
            