package com.scala.collection

/**
  * @author Administrator
  * @date 2017-12-24-上午10:31
  */
object builder {
  def main(args: Array[String]): Unit = {
    //builder:集合构建器,只能生成指定类型的集合，只支持追加操作
    val b = Set.newBuilder[Char]
    b += 'h'
    b ++= List('e','l','l','o')
    println(b.result())

  }
}
