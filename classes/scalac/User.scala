class User(named: String){
	println("this was created!") // is executed everytime an object is created
	val age: Int = 34
	def greet() {
		println(s"Hi ${named}")
	}
}