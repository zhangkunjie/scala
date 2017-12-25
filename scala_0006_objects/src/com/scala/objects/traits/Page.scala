package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:18
  */
class Page(val s: String) extends HtmlUtils {
  def asPlainText = removeMarkup(s)
}
