package com.scala.ctrlandfunc

object matchdemo {
  def main(args: Array[String]): Unit = {
    //模式匹配
    val status: Int = 300
    val message = status match {
      case 200 => "ok"
      case 400 => {
        println("ERROR")
        "error"
      }
      case 500 => {
        println("ERROE server error")
      }
        "error"
      case _ => println(s"匹配不到输入的状态$status")
        -1
    }
    println(message)
    //带if
    val dd: Double = 1.2
    val yy = dd match {
      case dd if dd > 0 => "greater"
      case dd if dd == 0 => "same"
      case dd if dd < 0 => "less"
    }
    println(yy)
    //模式哨卫
    val response: String = "200"
    response match {
      case s if s != null => println(s"Received '$s'")
      case s => println("Error! Received a null respone")
    }
    //模式变量
    val x: Int = 12380
    val y: Any = x
    y match {
      case x: String => s"'x'"
      case x: Double => f"$x%.2f"
      case x: Float => f"$x%.2f"
      case x: Long => s"${x}l"
      case x: Int => s"${x}"
    }
    println(y)
  }
}
