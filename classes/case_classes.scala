case class Person1(name: String, var age: Int)

var person1 = Person1("Francisco", 33)
println(person1.name) // francisco
// person1.name = "manolo" // error, by default attributes in case classes are VAL (like in normal classes)
println(person1.age) // 33
person1.age = 34 // 33
println(person1.age) // 33






