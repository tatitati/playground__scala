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
