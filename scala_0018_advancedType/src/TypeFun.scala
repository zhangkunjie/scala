/**
  * @author Administrator
  * @date 2017-12-25-下午2:05
  */
//类型别名
object TypeFun {
  //Whole:是抽象类Int的一个别名
  type Whole = Int
  //这样就可以定义一个整形的属性x，其值是5
  val x: Whole = 5
  type UserInfo = Tuple2[Int, String]
  val u = new UserInfo(123, "google")
  type T3[A, B, C] = Tuple3[A, B, C]
  val things = new T3(1, 'a', true)

  def main(args: Array[String]): Unit = {
    val x = TypeFun.x
    println(x)
    val u = TypeFun.u
    println(u)
    val things = TypeFun.things
    println(things)

  }
}
