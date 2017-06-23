package com.scala.xml
/**
  * @author Administrator
  */
object functiontest {
  def main(args: Array[String]): Unit = {
    val s="http://www.xuetuwuyou.com/"
    val xmlUrl= "<a>{"+s+ "}</a>"
    //<a> http://www.xuetuwuyou.com/ </a>
    println(xmlUrl)
  }
}