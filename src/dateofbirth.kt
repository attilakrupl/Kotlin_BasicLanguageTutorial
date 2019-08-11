package demo

import java.util.*

fun main()
{
    print("Enter year of birth: ")
    val yearOfBirth:Int = readLine()!!.toInt()
    print("Enter month of birth: ")
    val monthOfBirth:Int = readLine()!!.toInt()
    print("Enter day of birth: ")
    val dayOfBirth:Int = readLine()!!.toInt()

    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val monthInDevice = Calendar.getInstance().get(Calendar.MONTH) + 1
    val dayInDevice = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

    var age:Int = yearInDevice - yearOfBirth

    if ( monthInDevice < monthOfBirth
        || ( monthInDevice == monthOfBirth
                && dayInDevice < dayOfBirth ) )
    {
        --age
    }

    print("Your age is: $age")
}