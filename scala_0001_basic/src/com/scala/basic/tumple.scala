package com.scala.basic

object tumple {
  def main(args: Array[String]): Unit = {
    //元祖
    var t = (1, "a", 2.4f, 'b')
    println(t)
    println(t._2)
    //key-value元祖
    var t2 = "name" -> "tom"
    println(t2._1)
    println(t2._2)
  }
}
