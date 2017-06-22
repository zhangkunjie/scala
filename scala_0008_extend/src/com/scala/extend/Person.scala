package com.scala.extend

/**
 * @author Administrator
 */
class Person {
  private var age=0
  private var name=""
  def getName()=
  {
    this.name
  }
  def  setName(name:String)=
  {
    this.name=name
  }
  def getAge()=
  {
    this.age
  }
  def setAge(age:Int)=
  {
    this.age=age
  }
  def this(age:Int,name:String)
  {
    this()
    this.age=age
    this.name=name
  }
  def toString1()=
  {
    this.getName()
  }
}