import kotlin.math.pow
import  kotlin.math.PI


fun main(){
    val x = 25
    val y = 30F

    val sum = x + y
    val multiplication = x * y
    val division = if (x>y){ x/y} else (y/x);
    val sub = if (x>y){ x-y} else (y-x);
    println("The numbers are $x , $y")
    println("Sum = $sum")
    println("Multiplication = $multiplication")
    println("Division = $division")
    println("Subtraction = $sub")


    val radius = 5.5

    println("The Volume of the sphere with the $radius is ${0.75*radius.pow(3)* PI} ")
}