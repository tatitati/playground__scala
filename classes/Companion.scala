

//
// Object in scala de-couple static stuff from the traditional class
//
object Person1 {
	def saySomething(something: String): String  = {
		something
	}
}
println(Person1.saySomething("this is something!!!")) // this is something!!!


//
// Apply as default method
//
object Person2 {
	def apply(something: String): String  = {
		something
	}
}
println(Person2("this is something!!!")) // this is something!!!

//
// Object as companion object to de-couple static methods
//
object Person3 {
	def saySomething(something: String): String  = {
		something
	}
}

class Person3 {

}
println(Person3.saySomething("this is something!!!")) // this is something!!!


//
// Apply method as factory method
//
object Person4 {
	def apply(age: Int): Person4  = {
		new Person4(age = age, name = "default name")
	}
}

class Person4(val age: Int, val name: String) {

}
val myperson4 = Person4(33)
println(myperson4.age) // 33
println(myperson4.name) // default name



