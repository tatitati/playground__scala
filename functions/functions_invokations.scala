class MyClass() {
	def doubler(x: Int): Int = {
		x * 2
	}
}

val val0 = new MyClass()

// invokation of methodd with "operator notation"
var val1 = val0 doubler 6
var val2 = val0.doubler(6)
println(val1) // 12
println(val2) // 12



def squarer(x: Int): Int = {
	x * x
}
println(squarer(2)) // 4
println(squarer{3+3}) // 36 "6*6"

