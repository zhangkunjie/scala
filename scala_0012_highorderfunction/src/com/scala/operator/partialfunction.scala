package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-下午4:19
  */
//偏函数：满足部分输入输出的函数：比如match 除法（除数不能为0）等
//比如match:最终要有一个默认值就不会报错
object partialfunction {
  def main(args: Array[String]): Unit = {
    val code = 300
    val result = code match {
      case 200 => "正常"
      case 404 => "未找到页面"
      case 500 => "服务器异常"
      case _ => "未知错误"
    }
    println(result)
  }
}
