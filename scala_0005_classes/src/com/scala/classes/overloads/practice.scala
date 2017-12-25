package com.scala.classes.overloads

/**
  * @author Administrator
  * @date 2017-12-24-下午3:57
  */
object practice {
  def main(args: Array[String]): Unit = {
    val p = new Printer("Msg")
    p.print("a")
    p.print(List("b", "c"))
  }
}
