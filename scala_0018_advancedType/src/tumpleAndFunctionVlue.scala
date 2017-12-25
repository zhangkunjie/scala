/**
  * @author Administrator
  * @date 2017-12-25-上午9:49
  */
object tumpleAndFunctionVlue {
  def main(args: Array[String]): Unit = {
    val t1: (Int, Char) = (1, 'a')
    //Tuple:包含2个元素的元祖，Tuple3:包含3个元素的元祖
    val t2: (Int, Char) = Tuple2[Int, Char](1, 'a')
    val t3: (Int, Char, Int) = Tuple3[Int, Char, Int](1, 'a', 1)
    val f1: Int => Int = _ + 2
    val f2: Int => Int = new Function1[Int, Int] {
      def apply(x: Int) = x * 2
    }
    val f3: Int => String = new Function1[Int, String] {
      def apply(x: Int) = (x * 2).toString
    }
    println(f1(2))
    //f2(20)为什么报错
    println(f3(20))
    println(t1.productArity)
    println(t2.productArity)
    val doubler = (x: Int) => x * 2
    val plus3 = (x: Int) => x + 3
    //compose:先算后面
    println((doubler compose(plus3)) (2))
    //andThen:先算前面
    println((doubler andThen(plus3)) (2))
  }
}