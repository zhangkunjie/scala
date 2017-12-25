/**
  * @author Administrator
  * @date 2017-12-25-上午10:21
  */
//隐含类型:greeting
object ImplicitParams {
  def greet(name: String)(implicit greeting: String) = s"$greeting,$name"

  def getDuoble(num1: Int)(implicit num2: Int) = num1 * num2

  //隐含类型
  implicit val hello1 = "Hello1"
  implicit val n: Int = 2

  def test = {
    println(greet("Developers"))
  }

  //调用getDouoble的时候发现了隐含类型，会自动去系统中查找对应的隐含类型参数，然后再去计算
  def test1 = {
    println(getDuoble(10))
  }

  def main(args: Array[String]): Unit = {
    println(test)
    println(test1)
  }

}
