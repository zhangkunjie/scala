package com.scala.map

import scala.collection.immutable.SortedMap
import scala.collection.mutable

/**
  * @author Administrator
  */
object maptest {
  def main(args: Array[String]): Unit = {
    val scores = Map("id" -> 1, "name" -> "张三", "age" -> 22)
    println(scores.get("name"))
    println(scores.getOrElse("ages", 0))
    val scores2 = scala.collection.mutable.Map("id" -> 1, "name" -> "李四")
    scores2("name") = "王五"
    scores2 += ("sex" -> 1)
    for (k <- scores2.keySet)
      print(k + "#")
    println("")
    val scores3 = SortedMap("id5" -> 5, "id2" -> 2, "id3" -> 3)
    for (v <- scores3.values)
      print(v + "&")
    println("")
    val scores4 = mutable.LinkedHashMap("id5" -> 5, "id2" -> 2, "id3" -> 3)
    for (v <- scores4.values)
      print(v + "&")
  }
}