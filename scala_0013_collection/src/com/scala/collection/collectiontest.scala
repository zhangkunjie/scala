package com.scala.collection
import scala.collection.mutable.LinkedHashSet
/**
 * @author Administrator
 */
object collectiontest {
  def main(args: Array[String]): Unit = {
  //List
  val list1=List(1,2,4)
  println("@@@@@@@")
  val list2=list1:+2
  println(list2)
  for(i<-0 until list2.size)
    println(list2(i))
  }
  //Set
  var s1=Set(9,4,3,8)
  var is1=s1.iterator
  while (is1.hasNext) {
    println(is1.next())
  }
  var s2=LinkedHashSet(9,4,3,8)
  println(s2)
  val names=List("tom","jerry","lily","xiaoing")
  println(names.map(_.toUpperCase()))
  val s="I have a dream"
  //print(s.flatMap(_=>s.split(" ")))  
  val l1=List(1,2,3)
  val l2=List(2,4,6)
  val l3=l1 zip l2
  println(l3)
}
