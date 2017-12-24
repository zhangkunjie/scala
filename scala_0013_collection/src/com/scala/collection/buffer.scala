package com.scala.collection

import scala.collection.mutable

/**
  * @author Administrator
  * @date 2017-12-24-上午9:57
  */
object buffer {
  def main(args: Array[String]): Unit = {
    //可变集合：scala.collection.mutable.Bufer Map Set三种
    val numbers1 = mutable.Buffer(1)
    for (i <- 2 to 10)
      numbers1 += i
    println(numbers1)
    //空的集合必须指定参数类型
    val numbers2 = mutable.Buffer[Int]()
    for (i <- 1 to 10)
      numbers2 += i
    println(numbers2)
    println(numbers2.toList)
  }
}
