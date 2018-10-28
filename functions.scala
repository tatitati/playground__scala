def sayHello(to: String, from: String) {
    print(s"Good morning $to, from $from")
}

sayHello("francisco", "whoever") // Good morning francisco, from whoever
sayHello(from = "whoever", to = "francisco") // Good morning francisco, from whoever


//
// Functions literals  or lambadas or anonymous functions
//
val helloTo = (name: String) => print(s"hello ${name} !!")
helloTo("David") // hello David !!
