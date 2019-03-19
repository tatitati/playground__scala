//
// with infered return type
//
val sum = (x: Int, y: Int) => x + y

assert(
	sum(2, 3) == 5
)

//
// with explicit return type
//
val sum1: (Int , Int) => Int = (x, y) => { x + y }
assert(
	sum1(2, 3) == 5
)


// functions literals can be defined inside of higher fucntions invocations
def mathOperation(a: Int, b: Int, f: (Int, Int) => Int) = {
	f(a, b)
}
println(mathOperation(2, 3, (x: Int, y: Int) => x*y)) // 6