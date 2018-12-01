
// trait extending a class force to extends same class

class Person(name: String, age: Int) {
	def describe() = {
		println(s"my name is ${name} and I'm ${age} years old")
	}
}
var person1 = new Person("Francisco", 32)
person1.describe() // my name is Francisco and I'm 32 years old





trait Developer extends Person { // This trait is extending a class Person. So, any class extending this trait must extends also the class Person (below)
	var lenguage: String = _

	def setSelenguage(lenguageCoding: String) = {
		lenguage = lenguageCoding
	}

	def getSelenguage(): String = {
		lenguage
	}
}




class European(name: String, age: Int, city: String) extends Person(name: String, age: Int) with Developer {
	override def describe() = {
		println(s"my name is ${name} and I'm ${age} years old, experimented on the lenguage ${lenguage}")
	}
}
var european1 = new European("Francisco", 32, "Ubeda")
european1.setSelenguage("java")
european1.describe() // my name is Francisco and I'm 32 years old, experimented on the lenguage java