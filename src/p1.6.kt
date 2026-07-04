fun main() {
    println("Enter First Number:")
    val number1 = readln().toInt()
    println("Enter Second Number:")
    val number2 = readln().toInt()

    println("Addition of $number1, $number2 is ${add(number1, number2)}")
    println("Subtraction of $number1, $number2 is ${subtract(number1, number2)}")
    println("Multiplication of $number1, $number2 is ${multiply(number1, number2)}")
    println("Division of $number1, $number2 is ${divide(number1, number2)}")

}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}
fun subtract(number1: Int, number2: Int): Int {
    return number1 - number2
}
fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}
fun divide(number1: Int, number2: Int): Int {
    return number1 / number2
}