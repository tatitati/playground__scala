//
// function returning function
//
def math(x: Int): (Int) => (String) = {
  (num1: Int) => s"The result is ${num1+x}"
}

val func1 = math(5)
println(func1) // Main$$anon$1$$Lambda$139/0x0000000800208840@6b419da
println(func1(1)) // The result is 6



//
// passing a function as parameter
//
def math(f:(Int, Int) => Int, x: Int, y: Int): String = {
  s"THe result of the operation is: " + f(x, y)
}

var f = (x: Int, y: Int) => x + y
println(math(f, 2, 3)) // THe result of the operation is: 5


var f1: (Int, Int) => Int = (x, y) => x + y
println(math(f1, 2, 3)) // THe result of the operation is: 5