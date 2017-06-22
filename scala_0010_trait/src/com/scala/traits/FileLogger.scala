package com.scala.traits

/**
 * @author Administrator
 */
trait FileLogger extends Logger{
  def log(msg:String)
  {
    print(msg)
  }
}