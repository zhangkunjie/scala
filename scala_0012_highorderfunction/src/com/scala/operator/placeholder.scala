package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-上午11:47
  */
object placeholder {
  //普通函数：字符串反转
  def safeStringOp(s: String, f: String => String) = {
    if (s != null)
      s.reverse
    else
      null
  }

  //更通用的方法
  def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)

  //泛型函数：一个函数可以传递和返回更多的类型
  def tripleOp[A, B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a, b, c)

  def main(args: Array[String]): Unit = {
    //普通函数字面量
    val double1 = (x: Int) => x * 2
    println(double1(2))
    //占位符语法
    val doubler2: Int => Int = _ * 2
    println(doubler2(5))
    //字符串翻转三种形式
    println(safeStringOp("abc", (s: String) => s.reverse))
    println(safeStringOp("abc", s => s.reverse))
    println(safeStringOp("abc", _.reverse))
    println(combination(10, 2, (a: Int, b: Int) => a % b))
    println(combination(10, 2, _ * _))
    println(combination(10, 2, _ + _))
    println(combination(10, 2, _ - _))
    println(combination(10, 2, _ / _))
    println(tripleOp[Int, Int](10, 20, 30, _ + _ + _))
    println(tripleOp[Int, Float](10, 20, 30, _ * _ / _))

  }
}
