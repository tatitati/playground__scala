//
// implicit variables in functions
//
// for multiple params in the function we have to group the implicit params
def sayMsg2(msg: String)(implicit something: String): String = {
	msg + something
}
// we can pass both params
println(sayMsg2("the post!!!")( "whatever")) // the post!!!whatever

// we can "implicityly" pass the second parameter
implicit var prefix2 = "this is an implicit prefix!!!"
println(sayMsg2(msg = "this is the police")) // this is the policethis is an implicit prefix!!!




//
// implicit classes for class conversion
//