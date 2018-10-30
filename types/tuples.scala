val info = ("something here", 3434, false)

println(info) // (something here,3434,false)
println(info._1) // something here
println(info._2) // 3434


// we can can unpack
val (something, number1, number2) = ("something here", 3434, false)
println(something)
println(number1)