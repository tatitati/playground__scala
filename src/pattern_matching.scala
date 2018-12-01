
trait Animal
case class Herb(name: String = "Cow", age: Int = 1) extends Animal
case class Canival(name: String = "Lion", age: Int = 1) extends Animal






//
// only matching type
//
def makeNoise1(animal: Animal): String = {
animal match {
	case a: Herb => "miumiumiu"
	case b: Canival => "RoarRoar!!!!"
}
}
println(makeNoise1(Herb())) // miumiumiu






//
// Proper pattern matching
//
def makeNoise2(animal: Animal): String = {
	animal match {
		case Herb(name, age) => "miumiumiu"
		case Canival(name, age) => "RoarRoar!!!!"
	}
}
println(makeNoise2(Herb())) // miumiumiu






//
// You can be more specifc indicating specific values
//
def makeNoise3(animal: Animal): String = {
	animal match {
		case Herb(name, 10) => "miumiumiu 10"
		case Canival(name, age) => "RoarRoar!!!!"
		case Herb(name, 1) => "miumiumiu 1"
	}
}
println(makeNoise3(Herb())) // miumiumiu 1






//
// You can ignore the value of another ones using _
//
def makeNoise4(animal: Animal): String = {
	animal match {
		case Herb(name, 10) => "miumiumiu 10"
		case Canival(name, age) => "RoarRoar!!!!"
		case Herb(name, _) => "miumiumiu 1"
	}
}
println(makeNoise4(Herb())) // miumiumiu 1







// you can use a custom matcher
def makeNoise6(httpResponse: String): String = {
	httpResponse match {
		case ValidHttpResponse() => s"the response ${httpResponse} is VALID"
		case _ => "no matched"
	}
}
object ValidHttpResponse {
	def unapply(arg: String): Boolean = {
		arg == "200" || arg == "201" || arg == "204"
	}
}
println(makeNoise6("200")) // the response 200 is VALID







//
// You can do the same with the return values of a functions, Generics types, etc, for example:
//
def makeNoise5() = {

	("hola", "hi", "bonjour")
}

val (spanish, english, bonjour) = makeNoise5()
println(spanish) // hola

val (spanish1, _, _) = makeNoise5()
println(spanish1) // hola

val (spanish2, _, "bonjour") = makeNoise5()
println(spanish2) // hola