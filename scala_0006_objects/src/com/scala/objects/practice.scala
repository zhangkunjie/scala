package com.scala.objects

/**
  * @author Administrator
  * @date 2017-12-24-下午8:57
  */
object practice {
  def main(args: Array[String]): Unit = {
    val h = Character("张三", true)
    val r = h.copy(name = "李四")
    println(h == r)
    h match {
      case Character(x, true) => s"$x is a thief"
      case Character(x, false) => s"$x is not a thief"
    }
    println(h)
  }
}
