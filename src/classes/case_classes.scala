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



// tupled
// case classes can use tupled to create objects from a tuple that looks like the list of constructor argument:
var person1Params = ("Roberto", 343)
println(Person1.tupled(person1Params)) // Person1(Roberto,343)


// unnaply
// Case classes implements by default unnaply, which is to reverse a method to its initial arguments constructor
var person1ParamsBack1 = Person1.unapply(Person1("Roberto", 343)).get
var person1ParamsBack2 = Person1.unapply(Person1("Roberto", 343))
println(person1ParamsBack1) // (Roberto,343)
println(person1ParamsBack2) // Some((Roberto,343))