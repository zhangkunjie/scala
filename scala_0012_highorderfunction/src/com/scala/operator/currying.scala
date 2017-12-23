package com.scala.operator


/**
  * @author Administrator
  * @date 2017-12-23-下午3:12
  */
//柯里化：将一个函数参数表分拆成多个函数参数表
//固话某些参数，方便使用
object currying {
  //普通函数：判断x是否能被y整除
  def factorOf(x: Int, y: Int): Boolean = y % x == 0

  //柯里化之后的函数:一组参数变成了多个
  def factorOfNew(x: Int)(y: Int) = y % x == 0

  def main(args: Array[String]): Unit = {
    println(factorOf(2, 5))
    println(factorOf(2, 4))
    //标准函数参数
    val factorOf1 = (a: Int, b: Int) => factorOf(a, b)
    println("factorOf1：" + factorOf1(3, 9))
    //factorOf2：省略了的函数参数
    val factorOf2 = factorOf _
    println("factorOf2：" + factorOf2(2, 6))
    //如果我只想判断2能不能被y整除怎么办？
    val factorOf3 = factorOf(2, _: Int)
    println("factorOf3：" + factorOf3(4))
    //判断是否是偶数
    val isEven = factorOfNew(2) _
    println(isEven(10))
    println(isEven(11))

  }
}
