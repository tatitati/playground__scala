// is we add the _ case, then is not a partial, at the function will support then all the cases. 
// However, a partial should support only some limited amount of cases, not all
val statusHandler: Int => String = {
	case 200 => "Okay"
	case 400 => "Your Error"
	case 500 => "Our Error"
}

println(statusHandler(200)) // Okay
println(statusHandler(300)) // scala.MatchError
