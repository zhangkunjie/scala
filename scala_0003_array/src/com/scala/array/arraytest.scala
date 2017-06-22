package com.scala.array

import scala.collection.mutable.ArrayBuffer

/**
  * @author Administrator
  */
object arraytest {
  def main(args: Array[String]): Unit = {
    //定长数组
    val a = new Array[Int](3)
    for (i <- 0 until a.length)
      print(a(i) + "#")
    //变长数组
    val b = ArrayBuffer[Int]()
    b += 1
    b += (2, 3, 4)
    b.insert(3, 10)
    b.remove(1)
    b.trimEnd(1)
    println("")
    for (i <- 0 until b.length) {

      print(b(i) + "#")
    }
    println("")
    //数组转换
    val c = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val result = c.filter(_ % 2 == 0).map(2 * _)
    for (i <- 0 until result.length)
      print(result(i) + "#")
    println("")
    //常用函数 sum max  min  quickSort等等
    val d = Array(1, 4, 2, 9, 5, 7)
    val maxD = d.max
    println(maxD)
    val sumD = d.sum
    println(sumD)
    scala.util.Sorting.quickSort(d)
    for (i <- 0 until d.length)
      print(d(i))
    val cc = ArrayBuffer(1, 4, 2, 7)
    //多维数组
    val matrix = Array.ofDim[Double](3, 4)
  }
}