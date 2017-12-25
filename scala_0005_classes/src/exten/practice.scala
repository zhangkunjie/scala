package exten

/**
  * @author Administrator
  * @date 2017-12-24-下午2:14
  */
object practice {
  def main(args: Array[String]): Unit = {
    val u = new User("张三")
    println(u.greet)
    val users = List(new User("Bate"), new User("Anni"), new User("Tom"))
    val sizez = users.map(_.name.size)
    val sorted = users.sortBy(_.name)
    val third = users.find(_.name contains ("A"))
    println(users)
    println(sorted)
    println(sizez)
    println(third)
    val hiA = new A().hi
    val hiB = new B().hi
    val hiC = new C().hi
    println(hiA)
    println(hiB)
    println(hiC)
    //多态:子类可以实例化父类，反过来不行
    val a: A = new A
    val ab: A = new B
    val b: B = new C
    //List要想装入ABC，必须定义为A类型
    val ll: List[User] = List(u)
    val t = new Car("Toyota", false)
    //t.reserve(true)
    println(s"My ${t.make} is now reserved?${t.reserved}")
    val t2 = new Car(reserved = false, make = "Tesla")
    println(t2.make)
    val l = new Lotus("Silver", false)
    println(s" ${l.color} ${l.make}")
    val l1 = new Car("Acure")
    println(l1)
    val l2 = new Car("Lexus", year = 2015)
    println(l2)
    val l3 = new Car(reserved = false, make = "Porsche")
    println(l3)
    val p = new Singular("Planes")
    p foreach println
  }
}
