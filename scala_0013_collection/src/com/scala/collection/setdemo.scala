package com.scala.collection

/**
  * @author Administrator
  * @date 2017-12-23-下午8:51
  */
object setdemo {
  def main(args: Array[String]): Unit = {
    //set和list类似：
    val numbers = Set(10, 20, 30, 10, 20)
    println(numbers(1))
    println(numbers.head)
    println(numbers.tail)
    for (x <- numbers) {
      print(x + " ")
    }
    //高阶函数
    val colors = List("red", "greed", "blue")
    colors.foreach((c: String) => println(c))
    val sizes = colors.map((c: String) => c.size)
    println(sizes)
    val total = numbers.reduce((a: Int, b: Int) => a + b)
    println(total)


  }
}
