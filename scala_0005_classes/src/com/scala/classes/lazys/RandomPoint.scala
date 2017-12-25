package com.scala.classes.lazys

/**
  * @author Administrator
  * @date 2017-12-24-下午4:14
  */
class RandomPoint {
  val x = {
    println("creating x"); util.Random.nextInt()
  }
  //lazy:在第一次使用属性的时候才创建
  lazy val y = {
    println("creating y"); util.Random.nextInt()
  }

}
