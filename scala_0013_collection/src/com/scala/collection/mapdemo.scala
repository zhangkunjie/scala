package com.scala.collection

/**
  * @author Administrator
  * @date 2017-12-23-下午9:09
  */
object mapdemo {
  def main(args: Array[String]): Unit = {
    val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
    println(colorMap)
    println(colorMap.keys)
    println(colorMap.values)
    println(colorMap.contains("yellow"))
    val redRGB = colorMap("red")
    println(redRGB)

  }

}
