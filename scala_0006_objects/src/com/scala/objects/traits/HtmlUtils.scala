package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:17
  */
//trait:特质：
trait HtmlUtils {
  def removeMarkup(input: String) = {
    input.replaceAll("""</?\w[^>]*>""", "")
      .replaceAll("<.*>", "")

  }
}
