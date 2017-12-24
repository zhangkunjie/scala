package com.scala.array

import scala.util.control.Exception

/**
  * @author Administrator
  * @date 2017-12-24-上午11:40
  */
object futuredemo {
  //feture：多线程
  def main(args: Array[String]): Unit = {
    val f = concurrent.Future {
      Thread.sleep(5000)
      println("hi")
    }
  }
}