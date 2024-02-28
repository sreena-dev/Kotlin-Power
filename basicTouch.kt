fun main() {
    var a: Int =13
    //a++
    var a2: Int=20
   
    print("$a2 ")
    println("Hello, Kotlin!")
    
    println("$a+$a2")
    var sum = a+a2
    println("$sum")
    main3()
}
fun main2(){
    
    val str: String="shakaabooo "
    println("$str")
    println("New chat from a friend ")
}

fun main3() {
    val firstNumber: Int = 10
    val secondNumber: Int = 5
    val thirdNumber: Int = 8
    
    val result = add(firstNumber, secondNumber)
    //val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    //println("$firstNumber + $thirdNumber = $anotherResult")
}
//note in case of return use the datatype decleration in the after the funcion parameters
fun add(firstNumber: Int,secondNumber: Int): Int{
    val result=firstNumber+secondNumber
	//println("$result")
	return result
}

fun main4() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(operatingSystem: String, emailId: String){
    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId")
}

