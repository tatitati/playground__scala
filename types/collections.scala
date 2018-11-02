// lists
val colors = List("blue" , "orange", "red")
println(colors(0)) // blue
println(colors(1)) // orange

println(colors.head) // blue
println(colors.tail) // List(orange, red)



// sets
val cities = Set("Madrid", "Barcelona", "Madrid", "Barcelona", "Zurich")
println(cities) // Set(Madrid, Barcelona, Zurich)



// maps
val persons = Map("Australia" -> "Michael", "Spain" -> "Francisco", "Chinese" -> "Jin")
println(persons) // Map(Australia -> Michael, Spain -> Francisco, Chinese -> Jin)
println(persons("Australia")) // Michael