
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