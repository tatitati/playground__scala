//
// Basic class
//
class User(named: String){
    val age: Int = 34
    val name: String = named
    def greet() {
        print(s"Hi ${name}")
    }
}

var user = new User("manolo")
user.greet() // hi manolo
print(user.age) // 34


//
// Extending a class with args in constructor
//
class BasicUser(named: String) extends User(named) {
    override def greet() {
        print(s"good bye ${name}")
    }
}


var basicUser = new BasicUser(named = "Ricardo")
print(basicUser.greet) // good by Ricardo