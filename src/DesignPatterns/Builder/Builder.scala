class Human(name: String, age: Int) {
	override def toString(): String = {
		s"My name is ${name} and my age is: ${age}"
	}
}

class HumanBuilder(
    var name: String = "Manolo",
    var age: Int = 34
	) {
		def withName(name: String): this.type = {
			this.name = name
			this
		}

		def withAge(age: Int): this.type = {
			this.age = age
			this
		}

		def build(): Human =
		{
			new Human(name, age)
		}
}

var builder = new HumanBuilder()
val human1 = builder
		.withName("Ricardo")
		.withAge(20)
		.build()

println(human1) // My name is Ricardo and my age is: 20