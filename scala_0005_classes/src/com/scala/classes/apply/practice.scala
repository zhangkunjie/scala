package com.scala.classes.apply

/**
  * @author Administrator
  * @date 2017-12-24-下午4:02
  */
object practice {
  def main(args: Array[String]): Unit = {
    val m1 = new Multiplier(4)
    println(m1.apply(4))
    val m2 = m1(40) //apply就是函数的默认方法，比如list(1)
    println(m2)
  }
}
