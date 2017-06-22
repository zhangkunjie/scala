package com.scala.fileandregex
/**
 * @author Administrator
 */
object  regextest {
  def main(args: Array[String]): Unit = {
  //正则表达式:找出字符串中单独的数字并输出
  val s="sd 10 23 fgar 4 ere rt5 0"
  val numPattern="\\d+".r
  val numbers=numPattern.findAllIn(s).toArray
  for(n<-numbers)
    print(n)
  }
}