package com.scala.fileandregex
import scala.io.Source
/**
 * @author Administrator
 */
object readtest {
  def main(args: Array[String]): Unit = {
    //读取文件按照行打印
    val file1=Source.fromFile("/Users/user/Desktop/scala/test","utf-8")
    val str=file1.mkString
    printf(str)
    val lineIterator=file1.getLines()
    for(l<-lineIterator)
      {println(l)}
    //读网络数据
    val file2=Source.fromURL("http://www.douban.com/tag/2015/?focus=movie","utf-8") 
    print(file2.mkString)
    //从字符串中读取
    val file3=Source.fromString("AAAAAABBBBBBBBBBBBB")
    print(file3.mkString)
    //读取二进制文件
  }
}