
//
// trait requiring to be mixed with Developer force to any class to mix Developer
//
trait Chooser {
	self: Developer => // this means that I need to see extends Chooser with Developer

	def showOpinion() = {
		self.getLenguage() match {
			case "Java" => "java is really good"
			case "C" => "C is very purist"
		}
	}
}


trait Developer { // This trait is extending a class Person. So, any class extending this trait must extends also the class Person (below)

	var lenguage: String = _

	def setSelenguage(lenguageCoding: String) = {
		lenguage = lenguageCoding
	}

	def getLenguage(): String = {
		lenguage
	}
}




class European(name: String, age: Int, city: String) extends Chooser with Developer {
}
var european1 = new European("Francisco", 32, "Ubeda")
european1.setSelenguage("Java")
println(european1.showOpinion()) // java is really good