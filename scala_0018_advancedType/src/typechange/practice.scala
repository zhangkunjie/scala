package typechange

/**
  * @author Administrator
  * @date 2017-12-25-下午3:58
  */
object practice {
  def main(args: Array[String]): Unit = {
    //这个是类的多态，没有问题
    val c: Car = new Volvo
    //error:Volvo不能转成Car
    //val c: Item[Car] = new Item[Volvo](new Volvo)
    //协变类型:Item1上增加了+，就可以使用这种方式了
    val d: Item1[Car] = new Item1[Volvo](new Volvo)
  }
}
