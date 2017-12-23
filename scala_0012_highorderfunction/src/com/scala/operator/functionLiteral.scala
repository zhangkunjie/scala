package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-上午11:07
  */
object functionLiteral {
  //普通函数：找出2者最大值
  def max(a: Int, b: Int): Int = {
    if (a > b)
      a
    else
      b
  }

  //普通函数：字符串反转
  def safeStringOp(s: String, f: String => String) = {
    if (s != null)
      s.reverse
    else
      s.toUpperCase
  }
  def main(args: Array[String]): Unit = {
    //函数作为一个参数传递给变量
    val maximize: (Int, Int) => Int = max
    //使用
    println(maximize(10, 5))
    //过滤掉中间的函数名称，直接使用函数字面量
    val maximize1 = (a: Int, b: Int) => if (a > b) a else b
    println(maximize1(2, 4))
    //
    println(safeStringOp("abc",(s:String)=>s.reverse))
    println(safeStringOp("abc",s=>s.reverse))

  }
}
