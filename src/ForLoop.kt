package demo

fun main()
{
    for ( i:Int in 0..100 )
    {
        println("One by one: $i")
    }

    for ( i:Int in 100 downTo 0 step 3 )
    {
        println("Every third back from 100: $i")
    }

}
