package com.scala.ctrlandfunc

/**
  * @author Administrator
  */
object ifdemo {
  def main(args: Array[String]): Unit = {
    val x = 6
    val y=10
    val z= if (x < y) x else y
    print(z)
  }
}
