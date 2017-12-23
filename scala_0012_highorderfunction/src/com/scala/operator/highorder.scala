package com.scala.operator

/**
  * @author Administrator
  * @date 2017-12-23-下午4:32
  */
object highorder {
  def safeStringOp(s: String)(f: String => String) = {
    if (s != null)
      f(s)
    else
      s
  }

  def main(args: Array[String]): Unit = {
    val uuid = java.util.UUID.randomUUID().toString()
    val timedUUID = safeStringOp(uuid) {
      s =>
        val now = System.currentTimeMillis()
        val timed = s.take(24) + now
        timed.toUpperCase()
    }
    println(timedUUID)
  }

}
