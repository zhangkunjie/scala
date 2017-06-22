package com.scala.ctrlandfunc
/**
 * @author Administrator
 */
object fortest{
  def main(args: Array[String]): Unit = {
  var sum=0
   for(i<-1 to 10 )
     sum=sum+i
   print(sum)   
   for(i<-1 to 3 ;j<-1 to 5 )
     println("("+i+","+j+")")
  }
}