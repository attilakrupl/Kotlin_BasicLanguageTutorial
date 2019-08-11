package demo

fun main()
{
    print("Enter food id: ")
    var lFoodID:Int = readLine()!!.toInt()

    var lFoodName:String
    var lFoodPrice:Double

    when(lFoodID)
    {
        1->
        {
            lFoodName = "Banana"
            lFoodPrice = 12.25
        }

        2->
        {
            lFoodName = "Sandwich"
            lFoodPrice = 16.45
        }

        else ->
        {
            lFoodName = "You didn't order anything"
            lFoodPrice = 0.0
        }
    }

    println( "Your order: $lFoodName" )
    println( "Your order costs: $lFoodPrice" )
}