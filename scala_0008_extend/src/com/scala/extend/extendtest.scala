package com.scala.extend



/**
 * @author Administrator
 */
object extendtest {
  def main(args: Array[String]): Unit = {
    var student=new Student(1)
    student.setAge(22)
    student.setName("张三")
    //判断是否是一个类的子类
    if (student.isInstanceOf[Person])
    {
      println("True")
    }
    println(student.toString1())
  }
}