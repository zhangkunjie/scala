package xiebian

import com.sun.tools.javac.comp.Check

/**
  * @author Administrator
  * @date 2017-12-25-下午3:58
  */
object practice {
  //item：需要一个协变类型参数,get返回一个Volvo存储在父类Car中
  def item(v: Item[Volvo]) {
    val c: Car = v.get
  }

  //check:需要一个逆变类型参数，将自乐VolvoWagon传入到基类Volvo中
  def check(v: Check[Volvo]) {
    v.check(new VolvoWagon)
  }

  def main(args: Array[String]): Unit = {
    //error:需要一个Volvo
    //item(new Item[Car](new Car()))
    //正常
    item(new Item[Volvo](new Volvo()))
    //逆变：将父类car转换成了子类Volvo：
    check(new Check[Car])
    check(new Check[Volvo])
    //check:逆变不能从子类转换成父类
    //check(new Check[VolvoWagon])
  }
}
