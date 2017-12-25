package com.scala.classes.visitcontrol

/**
  * @author Administrator
  * @date 2017-12-24-下午4:42
  */
object practice {
  def main(args: Array[String]): Unit = {
    val u = new User("1234")
    val isValid = u.validate("4567")
    println(isValid)
    u.update("4567")
    val isValid1 = u.validate("4567")
    println(isValid1)
  }
}
