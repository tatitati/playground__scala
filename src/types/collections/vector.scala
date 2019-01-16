var vector1 = Vector(1.0, 2.0, 333)

println(vector1(1)) // 2.0
println(vector1.head) // 1.0
println(vector1.tail) // Vector(2.0, 333)
println(vector1 :+ 4444) // Vector(1.0, 2.0, 333.0, 4444)