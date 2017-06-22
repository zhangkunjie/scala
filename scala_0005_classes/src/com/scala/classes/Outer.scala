package com.scala.classes

import scala.collection.mutable.ArrayBuffer

/**
 * @author Administrator
 */
class Outer {
  private var name=""
  var inners=new ArrayBuffer[Inner]
  def setInner(age:Int)
  {
    var inner=new Inner(age)
    inners+=inner
  }
  def this(name:String)
  {
    this()
    this.name=name
  }
  class Inner()
  {
    private var age=0
    def this(age:Int)
    {
      this()
      this.age=age
    }
    def getAge()=age
    def setAge(age:Int)
    {
      this.age=age
    }    
  }
  def getName()=name
  def setName(name:String)
  {
    this.name=name
  }
}