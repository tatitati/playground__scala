def hi = "hello"
println(hi) // hello
//hi() // error: it was specified without parenthesis

// with a return type
def hi2: String = "hello2"
println(hi2) // hello2


// defined with paranthesys
def hi3() = "hello3"
println(hi3) // hello3 : it can be invoked with and without parenthesis as it was defined with parenthesis
println(hi3()) // hello3




// named paramters + default values
def sum(x: Int, y: Int = 1000): Int = {
    x + y
}
println(sum(2, 3)) // 5
println(sum(2)) // 1002
println(sum(x = 2, y = 3)) // 5



// parameter groups
def concat(x: Int, y: Int)(t: Int): String = {
    s"Position: ($x, $y), at moment: $t"
}
println(concat(10, 30)(3600)) // Position: (10, 30), at moment: 3600



// can return tuples, etc
def returnMultiple(): (Int, Double) = {
    return (34, 89.35)
}
val (number1, number2) = returnMultiple()
println(number1) // 34
println(number2) // 89.35



//
// implicit variables
//
// for multiple params in the function we have to group the implicit params
def sayMsg2(msg: String)(implicit something: String): String = {
    msg + something
}
println(sayMsg2("the post!!!")( "whatever")) // the post!!!whatever
implicit var prefix2 = "this is an implicit prefix!!!"
println(sayMsg2(msg = "this is the police")) // this is the policethis is an implicit prefix!!!





//
// Deprectated syntax: return values are ignored
//
def sum2(x: Int, y: Int) {
    x + y
}
println(sum2(2, 3)) // ()



//
// Method invocation: Operator notation
//
class MyClass() {
	def doubler(x: Int): Int = {
		x * 2
	}

	def summer(x: Int, y: Int): Int = {
		x + y
	}
}

val val0 = new MyClass()
var val1 = val0 doubler 6 // invokation of methodd with "operator notation" instead of the simple "."
var val2 = val0.doubler(6)
println(val1) // 12
println(val2) // 12


// "operator notation" but with multiple parameters
var val3 = val0 summer (3,2)
println(val3) // 5




// Method invocation: Block expression
def squarer(x: Int): Int = {
	x * x
}
println(squarer(2)) // 4
println(squarer{3+3}) // 36 "6*6"



