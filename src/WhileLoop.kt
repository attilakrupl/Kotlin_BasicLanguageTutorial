package demo

fun main()
{
    println("For loop")
    for ( i:Int in 1..10 )
    {
        println("Counter $i")
    }

    println("While loop")

    var lWhileCounter = 1
    while ( lWhileCounter < 10 )
    {
        println("Counter: $lWhileCounter")
        ++lWhileCounter
    }

    var lDoWhileCounter = 1
    do
    {
        println( "Do-While counter: $lDoWhileCounter" )
        ++lDoWhileCounter
    } while ( lDoWhileCounter < 10 )
}