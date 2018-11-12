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
var myperson4 = Person4(33)
println(myperson4.age) // 33
println(myperson4.name) // default name


