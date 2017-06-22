package com.scala.extend

/**
 * @author Administrator
 */
class Student extends Person {
  private var sid=0
  def this(sid:Int)
  {
    this()
    this.sid=sid
  }
  def setSid(sid:Int)
  {
    this.sid=sid
  }
  def getSid()={
    this.sid
  }
  override def toString1()=
  {
    this.getSid()+"#"+this.getAge()+"#"+this.getName()
  }
}