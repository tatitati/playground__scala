
val listFruits = List("apple", "banana", "melon", "potato")

var newlist1 = listFruits.map(_ + "!!!")
println(newlist1) // List(apple!!!, banana!!!, melon!!!, potato!!!)




// with pattern matching
var newlist2 = listFruits.map{
  case x => "Found: " + x
}
println(newlist2) // List(Found: apple, Found: banana, Found: melon, Found: potato)


// with lambdas
var newlist3 = listFruits.map{ x => "Found: " + x}
println(newlist3) // List(Found: apple, Found: banana, Found: melon, Found: potato)




var newlist4 = listFruits.map{ x => x.toUpperCase}
println(newlist4) // List(APPLE, BANANA, MELON, POTATO)
