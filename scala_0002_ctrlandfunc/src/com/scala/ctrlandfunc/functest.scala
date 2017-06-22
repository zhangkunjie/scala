package com.scala.ctrlandfunc
/**
 * @author Administrator
 */
object functest{
  def main(args: Array[String]): Unit = {
   print(sum(5))
  }
  def sum(n:Int)={
    var r=1
    for(i<-1 to n) r=r*i
    r
  }
}