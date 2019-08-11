package demo

fun main()
{
    print("Enter number1: ")
    var number1:Double = readLine()!!.toDouble()

    print("Enter number2: ")
    var number2:Double = readLine()!!.toDouble()

    number1 = number1 + number2
    number2 = number1 - number2
    number1 = number1 - number2

    println("Number1: $number1")
    println("Number2: $number2")
}