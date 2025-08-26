

fun main(){
    print("Give String to check palindrome: ")
    var str = readln().toString()

    if (str == str.reversed()){
        println("$str is a palindrome")
    }
    else
        println("$str is not palindrome")

    print("Enter your age:")
    var age = readln().toInt()

    if (65<age)
        println("You're really really old")
    else if (age in 19..65 ) {
        println("You're an adult")
    }
    else
        println("You're not an adult")


}