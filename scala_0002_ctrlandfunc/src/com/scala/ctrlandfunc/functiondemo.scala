package com.scala.ctrlandfunc

/**
  * @author Administrator
  */
object functiondemo {
  def sum(n: Int) = {
    var r = 1
    for (i <- 1 to n) r = r * i
  }

  //带参数的函数
  def plus(x: Int, y: Int): Int = {
    x + y
  }

  //没有返回值的函数
  def log(d: Double): Unit = {
    println(f"输入的值是$d%.2f")
  }

  //递归函数
  def recAdd(n: Int): Int = {
    if (n < 1)
      n
    else
      n + recAdd(n - 1)
  }

  //按参数名称调用函数
  def greet(prefix: String, name: String): String = {
    s"$prefix $name"
  }

  //多个参数
  def sum_many(items: Int*): Int = {
    var total = 0
    for (i <- items)
      total += i
    total
  }

  //参数组
  def sum_group(x: Int)(y: Int): Int = {
    x + y
  }

  //泛型
  def identity[A](a: A): A = a

  def main(args: Array[String]): Unit = {
    print(sum(5))
    println(plus(2, 5))
    println(recAdd(5))
    log(1.34)
    println(greet(name = "张三", prefix = "你好")) //指定参数顺序
    println(sum_many(10, 30, 50))
    println(greet("你好", "张三")) //默认顺序
    println(sum_group(20)(30))
    println(identity("A"))
    println(identity[String]("B"))
    println(identity[Int](12))
  }
}