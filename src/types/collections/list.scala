// lists
val colors = List("blue" , "orange", "red")
println(colors(0)) // blue
println(colors(1)) // orange

println(colors.head) // blue
println(colors.tail) // List(orange, red)


//
// convert list to map
//
case class Person(val age: Int, val name: String)

val listPerson = List(
	Person(32, "juan"),
	Person(50, "antonio")
)

val mapPerson = listPerson.map(personItem => (personItem.name, personItem.age)).toMap
println(mapPerson) // Map(juan -> 32, antonio -> 50)