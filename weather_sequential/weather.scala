import scala.io.Source
import scala.xml._

def getWeather(city: String) = {
	val baseUrl = "http://api.openweathermap.org/data/2.5/weather"
	val url = s"$baseUrl?q=$city&units=imperail&mode=xml&APPID=d36c3cddd264fb3b5f8effa8a3c41555"

	// request to url
	val response = Source.fromURL(url)

	// parse
	val xmlResponse = XML.loadString(response.mkString)

	// map
	val cityName = (xmlResponse \\ "city" \\ "@name").text
	val temperature = (xmlResponse \\ "temperature" \\ "@value").text
	val condition = (xmlResponse \\ "weather" \\ "@value").text

	(cityName, temperature, condition)
}

getWeather("London,uk")