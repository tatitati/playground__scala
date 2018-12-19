//
// function returning function
//
def math(x: Int): (Int) => (String) = {
  (num1: Int) => s"The result is ${num1+x}"
}

val func1 = math(5)
println(func1) // Main$$anon$1$$Lambda$139/0x0000000800208840@6b419da
println(func1(1)) // The result is 6