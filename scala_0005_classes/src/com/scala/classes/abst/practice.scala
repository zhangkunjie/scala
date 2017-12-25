package com.scala.classes.abst

/**
  * @author Administrator
  * @date 2017-12-24-下午3:20
  */
object practice {
  def main(args: Array[String]): Unit = {
    val m: Car = new RedMini(2005)
    println(m.color)
    val mi: Car = new Mini(2015, "blue")
    println(mi.color)

  }
}
