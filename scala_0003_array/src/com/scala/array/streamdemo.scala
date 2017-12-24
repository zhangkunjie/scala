package com.scala.array

/**
  * @author Administrator
  * @date 2017-12-24-上午10:48
  */
object streamdemo {
  //流：在使用的时候会缓存元素
  def inc(i: Int): Stream[Int] = Stream.cons(i, inc(i + 1))

  def inc1(head: Int): Stream[Int] = head #:: inc1(head + 1)

  def to(head: Char, end: Char): Stream[Char] = (head > end) match {
    case true => Stream.empty
    case false => head #:: to((head + 1).toChar, end)
  }

  def main(args: Array[String]): Unit = {
    val s = inc(1)
    println(s)
    println(s.take(5).toList)
    val s1 = inc1(1)
    println(s1)
    println(s1.take(5).toList)
    val hexChars = to('A', 'F').take(20).toList
    println(hexChars)
  }
}
