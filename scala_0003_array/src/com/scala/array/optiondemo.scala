package com.scala.array

/**
  * @author Administrator
  * @date 2017-12-24-上午10:42
  */
object optiondemo {
  //seq是所有序列的根类型，不能实例化，可以用来
  //创建List
  def main(args: Array[String]): Unit = {
    val inks = Seq('C', 'M', 'Y', 'K')
    println(inks)

  }
}
