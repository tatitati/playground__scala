val persons = Map("Australia" -> "Michael", "Spain" -> "Francisco")
println(persons) // Map(Australia -> Michael, Spain -> Francisco, Chinese -> Jin)
println(persons("Australia")) // Michael


// define a map
val personAge: Map[String, Int] = Map()
println(personAge) // Map()

// append item
var personMapUpdated1 = personAge + ("Paco" -> 232)
personMapUpdated1 += ("Manoli" -> 555)
println(personMapUpdated1) // Map(Paco -> 232, Manoli -> 555)

// update item
var personMapUpdated2 = personAge + ("Paco" -> 111)
println(personMapUpdated2) // Map(Paco -> 111)
personMapUpdated2 += ("Paco" -> 999)
println(personMapUpdated2) // Map(Paco -> 999)

// increment item in map ?