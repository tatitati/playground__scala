import scala.collection.mutable.ListBuffer

// lists
val colors = List("blue" , "orange", "red")
println(colors(0)) // blue
println(colors(1)) // orange

println(colors.head) // blue
println(colors.tail) // List(orange, red)





case class Person(val age: Int, val name: String)



// define list of persons
val listPerson2: List[Person] = List(
	Person(32, "juan"),
	Person(50, "antonio")
)
println(listPerson2) // List(Person(32,juan), Person(50,antonio))





//
// Append new elements to a List: IMPOSSIBLE!!!
// you can't add elements to a Scala List; it's an immutable data structure. Instead, you have to use ListBuffer
//
var listPerson3: ListBuffer[Person] = ListBuffer()
println(listPerson3) // ListBuffer()
listPerson3 += Person(32, "juan")
println(listPerson3) // ListBuffer(Person(32,juan))




//
// convert list to map
//
val listPerson = List(
	Person(32, "juan"),
	Person(50, "antonio")
)

val mapPerson = listPerson.map(personItem => (personItem.name, personItem.age)).toMap
println(mapPerson) // Map(juan -> 32, antonio -> 50)



// different syntax to create them. :: vs :::
val name = "manolo" :: "jacinto" :: "javi" :: Nil
println(name) // List(manolo, jacinto, javi)

val name1 = "manolo" :: "jacinto" :: Nil
val name2 = "manolo1" :: "jacinto1" :: Nil

println(name1 :: name2) // List(List(manolo, jacinto), manolo1, jacinto1)
println(name1 ::: name2) // List(manolo, jacinto, manolo1, jacinto1)