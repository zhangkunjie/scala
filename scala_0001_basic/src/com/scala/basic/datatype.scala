

object datatype {
  def main(args: Array[String]): Unit = {
    //数据类型Int Long Double Float
    var i: Int = 5
    var dd: Double = 5.5
    var l: Long = 5
    //i=l;高精度数据类型不允许向低精度数据转换
    println(i)
    println(dd)
    println(l)
    /*
  *数据类型快捷定义
  * */
    var a = 1
    var b = 2.0
    var c = 3f
    var d = 4d
    var e = 5l
    println(a, b, c, d, e)
    //字符char
    var c_r = 'A'
    println(c_r)
    //boolean
    var isFalse = !true
    println(isFalse)
    var isLess = (5 < 6)
    println(isLess)
    val v1 = 10;
    //v1=20; v1不能被赋值
    //字符串
    var s = "hello";
    val zero=0;
    val isValid=zero>0
    println(isValid);
  }
}