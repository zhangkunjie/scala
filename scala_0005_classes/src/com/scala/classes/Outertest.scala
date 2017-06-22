package com.scala.classes

import scala.collection.mutable.ArrayBuffer
/**
 * @author Administrator
 */
object  Outertest {
  def main(args: Array[String]): Unit = {
    var outer=new Outer("张三")
    println(outer.getName())
    outer.setInner(23)
    println(outer.inners(0).getAge())
  }
}