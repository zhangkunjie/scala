package com.scala.collection

/**
  * @author Administrator
  * @date 2017-12-23-下午8:51
  */
object listdemo {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 5, 6, 8)
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
    var it = numbers
    println(it)
    while (!it.isEmpty) {
      print(it.head + ",")
      it = it.tail
    }
    println()
    //Nil
    var i = numbers
    while (i != Nil) {
      print(i.head + ",")
      i = i.tail
    }
    println()
    val l: List[Int] = List()
    println(l == Nil)
    val m: List[String] = List("a")
    println(m == Nil)
    //构造列表
    val first = 1 :: 2 :: 3 :: 4 :: Nil
    println(first)
    val second = 2 :: first
    println(second)
    //list中常用的方法：
    println(first.takeRight(2))
    val ll = List(List(1, 2), List(3, 4))
    val xx = ll.flatten
    println(xx)
    //flatMap map操作
    val tf = List("name,age")
    println(tf.flatMap(_.split(",")))
    println(tf.map(_.toUpperCase()))
    //规约操作
    println(first)
    println(first.fold(0)(_ + _))
    println(first.foldRight(3)(_ + _))
    println(first.foldLeft(10)(_ + _))
    println(first.reduce(_ + _))
    println(first.reduceRight(_ + _))
    println(first.reduceLeft(_ + _))
    println(first.scan(0)(_ + _))
    println(first.scanRight(3)(_ + _))
    println(first.scanLeft(10)(_ + _))
    //list的模式匹配
    val result = first match {
      case x if x.contains(3) => "包含"
      case _ => "不包含"
    }
    println(result)
  }
}