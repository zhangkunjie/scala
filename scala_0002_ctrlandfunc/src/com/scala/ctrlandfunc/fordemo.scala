package com.scala.ctrlandfunc

/**
  * @author Administrator
  */
object fordemo {
  def main(args: Array[String]): Unit = {
    //for循环输出
    for (x <- 1 to 7) {
      println(s"Day $x")
    }
    //只输出偶数
    for (x <- 1 to 10 if x % 2 == 0) {
      println(s"$x")
    }
    //迭代循环
    val numbers = "1,2,3,4,5"
    for (
      t <- numbers.split(",")
    ) {
      println(t)
    }
    //嵌套迭代,要加分号
    for {x <- 1 to 2; y <- 1 to 3} {
      println(s"$x,$y")
    }
    //值绑定,移位操作
    for (i <- 0 to 8; pow = 1 << i) {
      println(pow)
    }
  }
}