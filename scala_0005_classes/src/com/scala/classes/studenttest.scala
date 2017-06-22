package com.scala.classes

/**
 * @author Administrator
 */
object studenttest {
  def main(args: Array[String]): Unit = {
    val student=new Student("张三",40)
    student.increment()
    student.increment()
    println(student.current())
    println(student.getAge())
    println(student.getName())
    student.setAge(30)
    println(student.getAge)
  }
}