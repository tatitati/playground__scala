case class MyValueObject(name: String, age: Int)

val object1 = MyValueObject("Francisco", 23)
println(object1.age) // 23
// object1.age = 34 // error