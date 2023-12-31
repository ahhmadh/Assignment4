package sheridan.hasahmad.assignment4.domain

data class WeatherResponse (
    val main : Main
)

data class Main(
    val temp : Double,
    val feels_like : Double,
    val temp_min : Double,
    val temp_max : Double,
    val pressure : Double,
    val humidity : Double
)