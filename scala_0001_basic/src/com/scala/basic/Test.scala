package com.scala.basic

trait Speak {
  def speak(country: String): String
}

class chineseSpeak extends Speak {
  override def speak(country: String): String = {
    return "你好！"
  }
}

class englishSpeak extends Speak {
  override def speak(country: String): String = {
    "hello!"
  }
}

object Test {
  def matchTest(x: Any): Any = x match {
    case 1
    => "one"
    case 2
    => "two"
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    var x:Int=5;
    print(x*3)
  }
}
