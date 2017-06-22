package com.scala.ctrlandfunc
/**
 * @author Administrator
 */
object whiletest{
  def main(args: Array[String]): Unit = {
   var sum=0
   var n=0
   while (n<=10) {
    sum=sum+n
    n=n+1
   }
   print(sum)
  }
}