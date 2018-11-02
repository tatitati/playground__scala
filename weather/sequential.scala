import scala.io.Source
import scala.xml._

def getWeather(city: String) = {
	println(city)

	val baseUrl = "http://api.openweathermap.org/data/2.5/weather"
	val url = s"$baseUrl?q=$city&units=imperail&mode=xml&APPID=d36c3cddd264fb3b5f8effa8a3c41555"

	// request to url
	val response = Source.fromURL(url)

	// parse
	val xmlResponse = XML.loadString(response.mkString)
	val cityName = (xmlResponse \\ "city" \\ "@name").text
	val temperature = (xmlResponse \\ "temperature" \\ "@value").text
	val condition = (xmlResponse \\ "weather" \\ "@value").text


	(cityName, temperature, condition)
}


val cities = List(
	"London,uk",
	"Chicago,us",
	"Boston,us",
	"Minneapolis,us",
	"Oslo,norway",
	"Tromso,norway",
	"Sydney,australia",
	"Berling,germany",
	"Krakow,poland",
	"Rome,italy",
	"Stockholm,sweden",
	"Bangalore,india",
	"Brussels,belgium",
	"Reykjavik,iceland"
)

val startAt = System.nanoTime()

cities map getWeather

val endAt = System.nanoTime()
println(s"\n\nTime ${(endAt - startAt)/1.0e9} sec")



// output



//London,uk
//Chicago,us
//Boston,us
//Minneapolis,us
//Oslo,norway
//Tromso,norway
//Sydney,australia
//Berling,germany
//Krakow,poland
//Rome,italy
//Stockholm,sweden
//Bangalore,india
//Brussels,belgium
//Reykjavik,iceland
//
//
//Time 0.851770093 sec