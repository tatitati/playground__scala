case class Person1(name: String, var age: Int)

// tupled
assert(
	Person1.tupled(("Roberto",343)) == Person1("Roberto",343)
)

// unnaply
assert(
	Person1.unapply(Person1("Roberto", 343)) == Some(("Roberto",343))
)




