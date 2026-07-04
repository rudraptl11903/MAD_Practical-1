fun main(){
    println("Enter Number:")
    val number = readln().toInt()

    println("Factorial of $number = ${factorial(number)}")

}
fun factorial(number: Int): Int {
    if (number <= 1)
        return 1
    return number * factorial(number - 1)
}