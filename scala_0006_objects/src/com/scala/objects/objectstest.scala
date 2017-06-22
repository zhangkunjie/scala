package com.scala.objects
/**
 * @author Administrator
 */
object objectstest {
  def main(args: Array[String]): Unit = {
   println(Accounts.newUniquNumber())
   println(Accounts.newUniquNumber())  
   for(w<-WeekDay.values)
     println(w)
  }
}