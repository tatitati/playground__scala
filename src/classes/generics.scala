trait Human {
	def isFrom(): String
}

class African() extends Human {
	def isFrom(): String = {
		"I'm from Africa"
	}
}

class Russian() extends Human {
	def isFrom(): String = {
		"I'm from Russia"
	}
}






//
// Upper bound. I can pass any subtime (or same) fro the upper specified class
//
class Foreigner0[A <: Human](foreigner: A) {
	def isFrom(): String = {
		foreigner.isFrom()
	}
}
val african0 = new African()
val foreigner0 = new Foreigner0[African](african0)
println(foreigner0.isFrom()) // I'm from Africa








class Foreigner2[A <: Russian with Human](foreigner: A) {
	def isFrom(): String = {
		foreigner.isFrom()
	}
}
val african2 = new African()
val foreigner2 = new Foreigner0[African](african2)
println(foreigner2.isFrom()) // I'm from Africa








//
// If I dont specify an upper bound, then I need to specify some "structural features", so that a function must exist
//
class Foreigner1[A <: { def isFrom(): String }](foreigner: A) {
	def isFrom(): String = {
		foreigner.isFrom()
	}
}



val african1 = new African()
val foreigner1 = new Foreigner1[African](african1)
println(foreigner1.isFrom()) // I'm from Africa