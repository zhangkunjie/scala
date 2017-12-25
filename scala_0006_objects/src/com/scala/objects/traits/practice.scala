package com.scala.objects.traits


/**
  * @author Administrator
  * @date 2017-12-24-下午9:18
  */
object practice {
  def main(args: Array[String]): Unit = {
    println(new Page("<html><body><h1>Hello wordl!</h1></body></html>").asPlainText)
    println(new D())
    val red = new Paint(128 << 16).hex
    println(red)
    val blue = new Overlay(192).hex
    println(blue)
  }
}
