//
// Decorator: The scala way (also is possible as usual)
// In the scala way we use traits at instantiation
// traits used in instantiation (AKA decorators/Stackable traits design pattern)
//
class Human3 {
	def saySomething(msg: String): String = {
		msg + "------------"
	}
}

trait HappyDecorator extends Human3 {
	override def saySomething(msg: String): String = {
		super.saySomething(msg) + ":))))))))))))"
	}
}

trait SadDecorator extends Human3 {
	override def saySomething(msg: String): String = {
		super.saySomething(msg) + ":_________("
	}
}


val human4 = new Human3() with HappyDecorator
println(human4.saySomething("THIS IS MY MSG")) // THIS IS MY MSG------------:))))))))))))

val human5 = new Human3() with SadDecorator
println(human5.saySomething("THIS IS MY MSG")) // THIS IS MY MSG------------:_________(


