

fun main(){
    print("Give String to check palindrome: ")
    var str = readln().toString()

    if (str == str.reversed()){
        println("$str is a palindrome")
    }
    else
        println("$str is not palindrome")


}