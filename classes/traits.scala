trait Galaxy {
    def getAmountStars() {
        print("I'm Galaxy")
    }
}

trait Planet {
    def getName() {
        print("I'm planet")
    }
}

trait Continent {
    def getPopulation() {
        print("I'm continent")
    }
}

class Africa(amount: Int) extends Continent with Planet with Galaxy{
    var population: Int = amount
}

var africa = new Africa(2323)
print(africa.population) // 2323
print(africa.getPopulation()) // I'm continent
print(africa.getName()) // I'm planet
print(africa.getAmountStars()) // I'm Galaxy