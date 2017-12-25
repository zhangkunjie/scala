package com.scala.classes.visitcontrol

/**
  * @author Administrator
  * @date 2017-12-24-下午4:41
  */
class User(private var password: String) {
  def update(p: String): Unit = {
    println("修改密码")
    password = p
  }

  def validate(p: String) = p == password
}
