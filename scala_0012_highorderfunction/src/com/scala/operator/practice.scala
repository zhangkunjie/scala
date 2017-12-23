package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-下午4:42
  */
//练习题
object practice {
  //两个整数，返回较大的值
  def max(x: Int, y: Int): Int = {
    if (x > y)
      x
    else
      y
  }

  def show(a: Int): Unit = {
    println("输出数字" + a.toString)
  }

  //高阶函数：给一个参数，调用一个以这个参数为函数并且无返回值的函数，然后返回这个函数
  def fzero[A](x: A)(f: A => Unit): A = {
    f(x);
    x
  }

  //高阶函数：
  //x:Int 函数的第一个输入值，整型的，比如5
  //f:Int=>String:函数的第二个输入值：必须是整数输入，字符输出
  //最后，Int 代表这个函数整体返回的值是一个整型
  def multiplication(x: Int)(f: Int => String): Int = {
    f(x).toInt * x;
  }

  def doubler(x: Int): String = {
    x.toString
  }

  //高阶泛型函数
  def conditional[A](x: A)(p: A => Boolean)(f: A => A): A = {
    if (p(x) == true)
      f(x)
    else
      x
  }

  //打印1-100,3的倍数：type,5的倍数：safe,15的倍数：typesafe:暂时放着
  def conditionalPrint(x: Int)(p: Int => String): Unit = {
    for (i <- 1 to x) {
      println(p(x))
    }
  }

  def main(args: Array[String]): Unit = {
    println(max(12, 4))
    val mytunple = (10, 11, 12)
    println(mytunple)
    val maxTumple = (x: Int, y: Int, z: Int) => max(max(x, y), z)
    println(maxTumple(10, 20, 30))
    util.Random.nextInt().max(10)
    println(fzero(5)((s: Int) => show(s)))
    println(multiplication(5)(x => doubler(x)))
  }
}
