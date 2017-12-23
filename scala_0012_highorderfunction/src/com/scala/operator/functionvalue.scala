package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-上午9:49
  */
object functionvalue {
  def double(x: Int): Int = {
    x * 2
  }

  def intToString(x: Int): String = {
    x.toString
  }

  def main(args: Array[String]): Unit = {
    //函数可以做为一个参数赋值给一个变量
    //=>指明这个函数把左边的东西（任何整数x）转变成右边的东西
    val myDouble1: (Int) => Int = double
    val myDouble2 = double _
    val myIntToString: (Int) => String = intToString
    var increase = (x: Int) => x + 1
    println(double(2))
    println(myDouble1(5))
    println(myDouble2(10))
    println(myIntToString(100))
    println(increase(11))
  }
}
