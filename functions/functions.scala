def hi = println("hello")
hi // hello
//hi() // error: it was specified without parenthesis

def hi2() = println("hello2")
hi2 // hello2 : it can be invoked with and without parenthesis as it was defined with parenthesis
hi2() // hello2





def hello: String = "hello again"
println(hello) // hello again



// named paramters + default values
def sum(x: Int, y: Int = 1000): Int = {
    x + y
}
println(sum(2, 3)) // 5
println(sum(2)) // 1002
println(sum(x = 2, y = 3)) // 5



// paramter groups
def concat(x: Int, y: Int)(t: Int): String = {
    s"Position: ($x, $y), at moment: $t"
}
println(concat(10, 30)(3600)) // Position: (10, 30), at moment: 3600






//
// Deprectated syntax: return values are ignored
//
def sum2(x: Int, y: Int) {
    x + y
}
println(sum2(2, 3)) // ()


