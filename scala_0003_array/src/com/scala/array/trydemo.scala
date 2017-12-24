package com.scala.array

/**
  * @author Administrator
  * @date 2017-12-24-上午11:28
  */
object trydemo {
  //try:一元操作符，主要用来进行异常处理
  def loopAndFail(end: Int, failAt: Int): Int = {
    for (i <- 1 to end) {
      println(s"$i")
      if (i == failAt)
        throw new Exception("Too many iterations")
    }
    end
  }

  def main(args: Array[String]): Unit = {
    //不加try会曝出异常
    //loopAndFail(10,3)
    val t1 = util.Try(loopAndFail(2, 3))
    val t2 = util.Try(loopAndFail(10, 3))


  }
}
