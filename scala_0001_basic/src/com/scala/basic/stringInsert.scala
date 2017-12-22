package com.scala.basic

import scala.math.sqrt

object stringInsert {
  def main(args: Array[String]): Unit = {
    //字符串内插
    val world = "世界"
    val greeting: String = "Hello"
    println(greeting + s"$world!")
    val money: Int = 100
    //有计算的话需要使用大括号
    println(s"我有${money * 3}元")
    printf(f"我有${money / 3}%2.2f元")
    println(99.99.toInt)
    //print(x++)scala没有++操作
    println(sqrt(9))
    println("hello" (1))
  }
}
