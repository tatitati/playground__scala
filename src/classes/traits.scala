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



//
// traits used in instantiation
//

