val statusHandler: Int => String = {
	case 200 => "Okay"
	case 400 => "Your Error"
	case 500 => "Our Error"
}

println(statusHandler(200)) // Okay
println(statusHandler(300)) // scala.MatchError