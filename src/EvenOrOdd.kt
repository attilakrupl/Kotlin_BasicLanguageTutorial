package demo

fun main()
{
    println("46 is even: ${isEven(46)}")
    println("45 is even: ${isEven(45)}")

}

fun isEven( aNum: Int ) : Boolean
{
    return aNum.rem( 2 ) == 0
}