package com.scala.collection

/**
  * @author Administrator
  * @date 2017-12-23-下午9:09
  */
object mapdemo {
  def main(args: Array[String]): Unit = {
    //不可变map
    val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
    println(colorMap)
    println(colorMap.keys)
    println(colorMap.values)
    println(colorMap.contains("yellow"))
    val redRGB = colorMap("red")
    //colorMap+=("blue"->0x0F)
    println(redRGB)
    //val的map是不可变的，可以转换为可变的
    val b = colorMap.toBuffer
    b += ("red" -> 0xFF0000)
    println(b)
    //再次变成不可变
    val a = b.toMap //val a是不可变的map不能在添加元素
    //a+=("blue" -> 0x0F)
    //将b转变为list,重复的red元素是可以保留的
    val l = b.toList
    println(b)
    //将b转变为set，重复的red会被删除,因为set不能存储重复元素
    val s = b.toSet
    println(s)
  }
}
