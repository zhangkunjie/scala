package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-下午3:41
  */
//传名函数
object functionbyname {
  def doubles1(x: Int) = {
    println("现在开始翻倍" + x)
    x * 2
  }

  def doubles2(x: => Int) = {
    println("现在开始翻3倍" + x)
    x * 3
  }

  def f(i: Int) = {
    println(s"Hello from f($i)"); i
  }

  def main(args: Array[String]): Unit = {
    //println(doubles1(2))
    //println(doubles2(2))
    val x = doubles1(f(8))
    println(x)
    val y = doubles2(f(8))
    println(y)
  }
}
