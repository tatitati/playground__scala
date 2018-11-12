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
println(Person2 {"this is something!!!" + "blabla blablba"}) // this is something!!!blabla blablba