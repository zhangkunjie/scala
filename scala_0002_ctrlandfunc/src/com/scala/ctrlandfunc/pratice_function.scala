package com.scala.ctrlandfunc

import math.pow

/**
  * @author Administrator
  * @date 2017-12-22-下午7:33
  */
object pratice_function {
  //计算圆的面积
  def calArea(r: Double): Double = {
    3.14 * r * r
  }

  //递归函数：需要输出5，10，15...50
  def recPrint(n: Int): Unit = {
    if (n < 11) {
      println(n + "," + recPrint(n + 5))
    }
    else {
      println(n)
    }
  }

  //日期描述
  def shwoTime(ms: Int): String = {
    ms / 3600000 / 24 + "天" + ms / 3600000 + "小时" + ms / 60000 + "分" + ms / 1000 + "秒"
  }

  //幂运算
  def mi(a: Double, b: Double): Double = {
    if (b == 1)
      a
    else
      a * mi(a, b - 1)
  }

  //计算两个点之间的差值
  def pointMinus(a: (Int, Int), b: (Int, Int)): (Int, Int) = {
    (a._1 - b._1, a._2 - b._2)

  }

  //类型参数:否则怎么办？
  def getFirstInt[A](input: (A, A)): A = {
    val result = input._1 match {
      case input._1 if input._1.isInstanceOf[Int] => input._1
    }
    result
  }

  //将输入的值转换成值，字符串的形式
  def getInputToString[A](input: (A, A, A)): (A, String, A, String, A, String) = {
    (input._1, input._1.toString, input._2, input._2.toString, input._3, input._3.toString)

  }

  def main(args: Array[String]): Unit = {
    println(calArea(3))
    recPrint(5)
    println(shwoTime(86400000))
    println(mi(2, 3))
    println(pointMinus((3, 1), (2, 4)))
    println(getFirstInt((1, 2)))
    println(getInputToString(1f, 2l, "adasd"))
  }
}
