package com.scala.objects

/**
  * @author Administrator
  * @date 2017-12-24-下午8:20
  */
object HtmlUtils {
  def removeMarkup(input: String) = {
    input.replaceAll("""</?\w[^>]*>""", "")
      .replaceAll("<.*>", "")

  }
  def main(args: Array[String]): Unit = {
    val html = "<html><body><h1>Hello wordl!</h1></body></html>"
    println(HtmlUtils.removeMarkup(html))
  }
}
