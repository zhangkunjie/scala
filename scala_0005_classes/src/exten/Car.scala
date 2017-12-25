package exten

/**
  * @author Administrator
  * @date 2017-12-24-下午2:45
  */
class Car(val make: String, var reserved: Boolean=true,val year:Int=2015) {
  override def toString: String = s"$year $make,reserved=$reserved"
}
