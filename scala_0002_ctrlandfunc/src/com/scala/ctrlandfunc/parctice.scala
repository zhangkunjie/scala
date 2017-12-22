package com.scala.ctrlandfunc

/**
  * @author Administrator
  * @date 2017-12-22-下午4:56
  */
object parctice {
  //函数练习

  def main(args: Array[String]): Unit = {
    val result: String = "aa"
    result match {
      case x if x != null => x
      case x if x == null => "n/a"
    }
    println(result)
    val dd: Double = -1.4
    val y = dd match {
      case dd if dd > 0 => "greater"
      case dd if dd == 0 => "same"
      case dd if dd < 0 => "less"
    }
    println(y)
    var result1: String = null
    if (dd > 0) {
    }
    result1 = "greaer"
    if (dd == 0) {
      result1 = "same"
    }
    if (dd < 0) {
      result1 = "less"
    }
    println(result1)
    for (i <- 0 to 5; j <- 0 to 100) {
      print(j + ",")
      if (j % 5 == 0)
        println()
    }
    for (i <- 0 to 100) {
      if (i % 3 == 0) {
        println("type")
      }
      if (i % 5 == 0) {
        println("safe")
      }
      if (i % 15 == 0) {
        println("typesafe")
      }
      else {
        println(i)
      }
    }





  }

}
