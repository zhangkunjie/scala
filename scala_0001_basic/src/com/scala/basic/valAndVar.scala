package com.scala.basic

object valAndVar {
  def main(args: Array[String]): Unit = {
    //val:value 不能再次赋值
    val s = "hello word!"
    println(s)
    //var:变量赋值之后还可以修改
    var x = 0
    x - 1
    //x的值不变
    println(x)
  }
}
