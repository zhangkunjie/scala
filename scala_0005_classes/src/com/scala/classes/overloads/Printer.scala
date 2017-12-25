package com.scala.classes.overloads

/**
  * @author Administrator
  * @date 2017-12-24-下午3:53
  */
//重载：函数名可以一样，参数类型不同
class Printer(msg: String) {
  def print(s: String): Unit = println(s"$msg:$s")

  def print(l: Seq[String]): Unit = println(l.mkString(","))
}
