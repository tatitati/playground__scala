//
// Basic class
//
class User(named: String){
    println("this was created!") // is executed everytime an object is created
    val age: Int = 34
    def greet() {
        println(s"Hi ${named}")
    }
}
var user = new User("manolo") // this was created!
user.greet // hi manolo
user.greet() // hi manolo
println(user.age) // 34


//
// Extending a class with args in constructor
//
class BasicUser(named: String) extends User(named) {
    override def greet() {
        println(s"good bye ${named}")
    }
}
var basicUser = new BasicUser(named = "Ricardo") // this was created!
println(basicUser.greet) // good bye Ricardo


//
// We can have more control by using var/val and override
//
//class Animal(val countryOrigin: String, var amountLegs: Int) {
//
//}
