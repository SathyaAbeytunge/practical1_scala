object temp{
    def convertToFahrenheit(celsius: Double): Double={
        celsius * 1.8000 + 32.00
    }

    def main(args: Array[String]): Unit={
        val celsius=35
        val fahrenheit = convertToFahrenheit(celsius)
        println(s"The temperature $celsius(celsius) in fahrenheit is $fahrenheit")

    }
}