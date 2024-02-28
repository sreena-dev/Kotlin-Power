fun main() {
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
	ComparisonOperator()
    main3()
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    var TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    //var TotalCALORIESburned = NumberOFStepS % CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}

fun ComparisonOperator(){
    val a: Int=10
    val b: Int=10
    
    if(a==b && a>b){
        println("equal")
    }
    else{
        println("Not Equal ")
    }
}

//same but bit clear
fun main2() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

//note that :Int is again used in the case of return
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

//declaring the parameter values in the function
fun displayAlertMessage(operatingSystem: String = "Unknown OS",emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}

//sample to return boolean and no use of variables 
fun main3() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

//you know it dude
fun main4() {
    printWeatherForCity("Ankara", 27, 31, 82)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
