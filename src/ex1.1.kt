fun main() {

    println("With using Third Variable:")
    var a = 10
    var b = 20

    println("Before Swapping:")
    println("The value of a is:$a and Value of B is:$b")

    val temp = a
    a = b
    b = temp

    println("After swapping")
    println("The value of a is:$a and Value of B is:$b")

    println("*".repeat(24))

    println("Without using Third Variable:")
    var x = 10
    var y = 20

    println("Before swapping")
    println("The value of a is:$x and b is $y")

    x = x + y
    y = x - y
    x = x - y

    println("After swapping")
    println("The value of a is:$x and b is $y")
}