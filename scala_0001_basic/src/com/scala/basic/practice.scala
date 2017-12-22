package com.scala.basic

/**
  * @author Administrator
  * @date 2017-12-22-下午4:17
  */
object practice {
  def transform(x: Int): Double = {

    return (x * 9 / 5) + 32;

  }

  def main(args: Array[String]): Unit = {
    println(transform(34))
    var dd: Double = 2.7255
    println("You own ${dd}")
    val flag: Boolean = true
    val result: Boolean = (!flag)
    println(result)
    var a: Int = 128
    var b: Char = a.toChar
    var c: String = a.toString
    var d: Double = a.toDouble
    print(b.toInt)
    print(c.toInt)
    println(d.toInt)
    var s = "Frnk,123 Main,925-555-1943,95122"
    var phonePattren = "\\d{3}-\\d{3}-\\d{4}".r
    val numbers = phonePattren.findAllIn(s).toArray
    for (n <- numbers)
      println(n.replace("-", ""))
    var phoneTumple = "phone" -> numbers(0)
    println(phoneTumple)

  }
}


