package com.scala.array

/**
  * @author Administrator
  * @date 2017-12-24-上午11:11
  */
//一元集合
object monadicdemo {
  def main(args: Array[String]): Unit = {
    var x: String = "Indeed"
    var a = Option(x)
    println(a)
    println(a.isDefined)
    println(a.isEmpty)
    var y = null
    var b = Option(y)
    println(b)
    println(b.isDefined)
    println(b.isEmpty)
    //option:表示一个可能存在的值
    val odds = List(1, 3, 5)
    val firstOdd = odds.headOption
    println(firstOdd)
    val evens = odds.filter(_ % 2 == 0)
    val firstEven = evens.headOption
    println(firstEven)
    //option：防止返回异常
    val sList = List("ad", "bb", "cc")
    val UpList = sList.filter(_ endsWith ("d")).map(_.toUpperCase())
    println(UpList)


  }
}
