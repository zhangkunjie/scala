package com.scala.patternmatch

/**
  * @author Administrator
  */
object functiontest {
  def main(args: Array[String]): Unit = {
    val friend =
      "eggs" match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }
    println(friend)
    var a = Array(1, 2)
    println(a match {
      case Array(0) => "0"
      case Array(x, y) => x + y
      case _ => "其他"
    })

    val (x, y) = (10, 20)
    println(x + y)
  }
}