package com.scala.highorderfunction
import scala.math._
/**
 * @author Administrator
 */
object functiontest {
  def main(args: Array[String]): Unit = {
  val num=3.14
  val fun=ceil _
  println(fun(1.2))
  val x=Array(1.2,3.6,4.31,2.6).map(ceil)
  for(i<-0 until x.length)
    print(x(i)+"#")
  println()  
  //匿名函数
  def triple(x:Double)=3*x
  println(triple(5)) 
  val y=Array(1,3,5).map((x:Int)=>3*x)
  for(i<-0 until y.length)
    print(y(i)+"#")
  println()  
  //带函数参数的函数
  def valueAtOneQuarter(f:(Double)=>Double)=f(0.25) 
  print(valueAtOneQuarter(sqrt _))
  }
  println()
  //类型推断
  val myfun=3*(_:Double)
  println(myfun(100))
  //高阶函数练习
  (1 to 9).map("*"*_).foreach(println(_))
  (1 to 9).filter(_%2==0).foreach(println(_))
  ("I like you but I do not like him").split(" ").foreach(println(_))
}