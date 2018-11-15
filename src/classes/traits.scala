//
// traits as interfaces
//
trait Human {
    def speak(message: String) :String
    def getGender(): String
}

class Man extends Human {
    override def speak(message: String): String = {
        message + "!!!!!"
    }

    override def getGender(): String = {
        "Male"
    }
}






//
// Traits as abstract classes
//
trait Human2 {
    def speak(message: String) :String = {
        message + "##########"
    }

    def getGender(): String // abstract method
}

class Man2 extends Human2 {
    override def getGender(): String = {
        "Male"
    }
}

val man2 = new Man2()
println(man2.speak("SAY SOMETHING")) // SAY SOMETHING##########







//
// traits used in instantiation
//







//
// Linearization
//
trait Galaxy {
    def getAmountStars() {print("I'm Galaxy")}
}
trait Planet {
    def getName() {print("I'm planet")}
}
trait Continent {
    def getPopulation() {print("I'm continent")}
}
class Africa(amount: Int) extends Galaxy with Planet with Continent {
    var population: Int = amount
}



// Linearization result
//
//      Galaxy
//          Planet
//              Continent
//                  Africa

var africa = new Africa(2323)
println(africa.population) // 2323
println(africa.getPopulation()) // I'm continent
println(africa.getName()) // I'm planet
println(africa.getAmountStars()) // I'm Galaxy
