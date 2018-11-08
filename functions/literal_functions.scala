//
// Functions literals  or lambadas or anonymous functions
//
val sum = (x: Int, y: Int) => x + y
println(sum(2, 3)) // 5


val sum1: (Int , Int) => Int = (x, y) => { x + y }
println(sum1(2, 3)) // 5


// functions literals can be defined inside of higher fucntions invocations
def mathOperation(a: Int, b: Int, f: (Int, Int) => Int) = {
	f(a, b)
}
println(mathOperation(2, 3, (x: Int, y: Int) => x*y)) // 6