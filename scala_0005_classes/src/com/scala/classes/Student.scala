package com.scala.classes
/**
 * @author Administrator
 */
class Student {
  private var value=0//必须初始化值
  private var name=""
  private var age=20
  def this(name:String,age:Int)
  {
    this()//调用主构造器
    this.name=name
    this.age=age
  }
  def setName(name:String)
  {
    this.name=name
  }
  def getName()=name
  def getAge()=age
  def setAge(age:Int)
  {
   this.age=age
  }
  def increment()
  {
    value+=1
  }
  def current()=value
}