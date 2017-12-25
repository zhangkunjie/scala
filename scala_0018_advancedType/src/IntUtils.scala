/**
  * @author Administrator
  * @date 2017-12-25-上午11:51
  */
object IntUtils {

  //隐含类：本质上也是一种类型
  //必须在对象、类和trait中定义。隐含类的方法可以被包含他的对象、类和trait
  //直接访问
  //最好在对象中实现
  implicit class Fishies(val x: Int) {
    def fishies = "Fish" * x
  }

  def main(args: Array[String]): Unit = {
    println(3.fishies)
  }
}

