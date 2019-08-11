package demo

// There are no semicolons inside Kotlin

fun main(args : Array<String>) {
    println( "Hello, world!" )                                   // Print to the console with println
    println( "Number of arguments: " + args.size )

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
        |long string""".trimMargin()
    println(lLongString)

    // Arrays
    var lMixedArray = arrayOf( 1, 1.23, "Element0", 'a')

    println(lMixedArray[2])

    lMixedArray[1] = "New Value"

    println("Array size: ${lMixedArray.size}")
    println("Value 'a' can be found in array: ${lMixedArray.contains('a')}")

    // A given range of an array can be copied into another array
    var lNewArray = lMixedArray.copyOfRange(0,1)

    //Functions
    fun add( aNum1: Int, aNum2: Int ) : Int = aNum1 + aNum2
    println("5 + 4 = ${add(4,5)}")

    //Var args
    fun sum(vararg aArgs : Int): Int
    {
        var sum = 0
        aArgs.forEach { number -> sum += number }

        return sum
    }
    println("Sum of 3 numbers: ${sum(4,7,44)}")
    println("Sum of 6 numbers: ${sum(4,7,44,63,7547,234)}")

}