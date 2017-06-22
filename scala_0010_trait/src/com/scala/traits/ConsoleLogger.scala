package com.scala.traits

/**
 * @author Administrator
 */
class ConsoleLogger extends Logger{
  def log(msg:String)
  {
    print(msg)
  }
}