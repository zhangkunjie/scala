package com.scala.fileandregex
import scala.io.Source
import java.io.PrintWriter
/**
 * @author Administrator
 */
object  writetest {
  def main(args: Array[String]): Unit = {
    //使用java的类库
    val outs=new PrintWriter("/Users/user/Desktop/scala/test1.txt")
    for(i<-1 to 100)
      outs.println(i)
    outs.close()
   //读取网络数据保存到文件中
    val file=Source.fromURL("http://www.douban.com/tag/2015/?focus=movie","utf-8") 
    val out=new PrintWriter("/Users/user/Desktop/scala/test.txt")
    out.println(file.mkString)
    out.close()  
  }
}