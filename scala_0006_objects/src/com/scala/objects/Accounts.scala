package com.scala.objects

/**
 * @author Administrator
 */
//object可以看成是单例的class
object Accounts {
  private var lastNumber=0
  def newUniquNumber()={
    lastNumber+=1;
    lastNumber
  }
}