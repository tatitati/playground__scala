
val listFruits = List("apple", "banana", "melon", "potato")

var newlist1 = listFruits.map(_ + "!!!")
println(newlist1) // List(apple!!!, banana!!!, melon!!!, potato!!!)





var newlist2 = listFruits.map{
  case x => "Found: " + x
}
println(newlist2) // List(Found: apple, Found: banana, Found: melon, Found: potato)





var newlist3 = listFruits.map{ x => "Found: " + x}
println(newlist3) // List(Found: apple, Found: banana, Found: melon, Found: potato)
