package com.scala.collection

/**
  * @author Administrator
  * @date 2017-12-23-下午8:46
  */

import scala.math.sqrt

object practice {
  //返回输入值的除了1和自己本身之外的因数
  def factors(x: Int): List[Int] = {
    var factorList: List[Int] = List()
    for (i <- 2 to sqrt(x).floor.toInt) {
      if (x % i == 0) {
        factorList = i :: x / i :: factorList
      }
    }
    factorList.distinct
  }
  def main(args: Array[String]): Unit = {
    //前20个奇数组成的list：实现1
    var x: List[Int] = List()
    for (i <- 1 to (20 + 1) * 2) {
      if (i % 2 == 1) {
        x = i :: x
      }
    }
    println(x)
    println(factors(24))
    val numbers = List(9, 11, 13, 15)
    val result = numbers.map(factors(_)).flatten
    println(result)
  }
}
