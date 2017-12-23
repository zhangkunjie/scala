package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-上午10:11
  *
  */
object highorderFunction {
  //这是一个高阶函数
  //:本身是一个变量，但是可以作为一个函数的参数使用
  def safeStringOp(s: String, f: String => String) = {
    if (s != null)
      f(s)
    else
      s
  }
  //定义需要传入的函数作为参数
  def reverser(s: String): String = {
    s.reverse
  }
  def main(args: Array[String]): Unit = {
    //第一个参数：普通String,
    //第二个参数：是一个函数，在safeStringOp中被调用处理第一个参数
    print(safeStringOp("abc", reverser))
  }
}
