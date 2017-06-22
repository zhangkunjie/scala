package com.scala.map
/**
 * @author Administrator
 */
object  tupletest{
  def main(args: Array[String]): Unit = {
    val t=(1,"张三",'A')
    //注意：元组的下标从1开始不是0
    print(t._2)
  }
}