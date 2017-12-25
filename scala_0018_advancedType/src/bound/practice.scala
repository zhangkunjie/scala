package bound

/**
  * @author Administrator
  * @date 2017-12-25-下午2:37
  */
object practice {
  //上界：BaseUser,表示泛型的最高层不能超越BaseUser
  def check[A <: BaseUser](u: A) {
    if (u.name.isEmpty) {
      println("Fail!")
    }
    else {
      println("Success")
    }
  }

  //下界：参数必须是不低于Customer的类型
  def recruit[A >: Customer](u: Customer): A = u match {
    case p: PreferredCustomer => new PreferredCustomer(u.name)
    case c: Customer => new Customer(u.name)
  }

  def main(args: Array[String]): Unit = {
    check(new Customer("Fred"))
    check(new Admin("", "strick"))
    val customer = recruit(new Customer("Fred"))
    val preferred = recruit(new Customer("George"))
    val v1 = new SecurityCard().verify(new Admin("George", "high"))
    val v2 = new GiftCard().verify(new Customer("Fred"))
    val v3 = new PerferCard().verify(new PreferredCustomer("张三"))
  }
}
