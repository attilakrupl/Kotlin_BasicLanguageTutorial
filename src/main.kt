package demo

// There are no semicolons inside Kotlin

fun main(args : Array<String>) {
    println("Hello, world!")                                     // Print to the console with println
    println(args)

    val lName = "Attila"                                         // Declare immutable variable, value can not be changed
    var lAge  = 34                                               // Declare mutable variable, value can be changed later
                                                                 // Although Kotlin is a statically typed language, explicit type specification is not needed.
                                                                 // Kotlin can infer the type of the variable from the initializer expression.

                                                                 // Types can be specified explicitly though:
    var lNumberOfFriends: Int = 2
    var lFavlouriteColor: String = "Blue"
                                                                 // There are two different ways to concatenate strings out of variables
    println( "Number of friends: " + lNumberOfFriends )          // Using + operator
    println( "Favorite color: $lFavlouriteColor")                // Using $ operator

    // Other types are: Char, Long, Double, Float, Short, Byte, Boolean
    // Getting the max and min value: Long.MAX_VALUE, Long.MIN_VALUE
    // Using floats can lead to losing precision, precision falls apart after 15 digits

    // Boolean values are either true or false
    // is operator can be used as typeof(x)== in C++
    if ( true is Boolean )
    {
        println("true is Boolean\n")
    }

    // We can add basic functions into e.g. println() function with ${} operator
    var lGradeLetter: Char = 'A'
    println("A is a Char: ${ lGradeLetter is Char }")

    // Casting inside Kotlin with toInt() and toChar()
    println("'A' to int: " + 'A'.toInt())
    println("96 to char: " + 96.toChar())

    //Long strings can be formatted with the triple quotes
    var lLongString = """This is a
long string"""
    println(lLongString)
}