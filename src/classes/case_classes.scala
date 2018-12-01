case class Person1(name: String, var age: Int)

var person1 = Person1("Francisco", 33)
println(person1.name) // francisco (even if I don't specify var/val, a case class consider that is a val, so it generates by default always a getter)
// person1.name = "manolo" // error, by default attributes in case classes are VAL
println(person1.age) // 33
person1.age = 34 // 33
println(person1.age) // 33






// class classes can have also custom methods
case class Person2(name: String, var age: Int) {
	def hello(): Unit = {
		println(s"Hello!!!!!!! {name}, my age is ${age}")
	}
}
var person2 = Person2("Ignacio", 23)
person2.hello() // Hello!!!!!!! Ignacio, my age is 23