package com.scala.classes.lazys

/**
  * @author Administrator
  * @date 2017-12-24-下午4:16
  */
object practice {
  def main(args: Array[String]): Unit = {
    val  p=new RandomPoint//x在实力化对象的时候就要初始化
    //y则是在使用的时候才会初始化
    println(p.x,p.y)
  }
}
