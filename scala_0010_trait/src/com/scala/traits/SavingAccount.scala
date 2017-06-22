package com.scala.traits

/**
 * @author Administrator
 */
//with:相当于多继承
class SavingAccount extends Account with FileLogger {
 def wirteToFile()
 {
   log("这是FileLogger中的方法")
 }
}
