

class Invoker {
	def invoke(command: Any) = {
		command
	}
}


val invoker = new Invoker()
invoker.invoke{
	println("first command here")
	println("second command here")
}





