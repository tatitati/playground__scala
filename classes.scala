class User(named: String, val age: Int = 34){
    val name: String = named
    def greet() {
        print(s"Hi ${name}")
    }
}

var user = new User("manolo")
user.greet() // hi manolo
print(user.age) // 34