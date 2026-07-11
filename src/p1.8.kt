fun main(){
    println("Create Array-1 by using arrayof() method: ")
    val array1 = arrayOf(10,90,60,80,100)
    println(array1.contentToString())
    println()
    println("Create Array-2 by using Array<>():")
    val array2 = Array(5) {0}
    println(array2.contentToString())
    println()
    println("Create Array-3 by using Array<>() and lambda function:")
    val array3 = Array(8) {index->index}
    println(array3.contentToString())
    println()
    println("Create Array-4 by using IntArray():")
    val array4 = IntArray(5)
    println(array4.contentToString())
    println()
    println("Create Array-5 by using intArrayOf():")
    val array5 = intArrayOf(12,10,5,18,19)
    println(array5.contentToString())
    println()

    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    val array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println(array6.contentDeepToString())
    println()

    println("Please enter Array value:")
    val userArray = IntArray(5)

    for(i in 0..<5){
        print("a[$i]=")
        userArray[i] = readln().toInt()
    }
    println("Entered Array:")
    println(userArray.contentToString())
    println()

    println("*".repeat(45) + "With Built-in Function" + "*".repeat(45))
    println("After sorting by built-in function:")
    userArray.sort()  // Sorts the array in-place (ascending order)
    println(userArray.contentToString())
    println()

    println("*".repeat(44) + "Without Built-in Function" + "*".repeat(45))
    val userArrayCopy = userArray.copyOf()  // Deep copy to avoid modifying sorted array

    println("Before Sorting:")
    println(userArrayCopy.contentToString())
    println()

    for (i in userArrayCopy.indices) {
        for (j in 0..<userArrayCopy.size - 1 - i) {
            if (userArrayCopy[j] > userArrayCopy[j + 1]) {
                val temp = userArrayCopy[j]
                userArrayCopy[j] = userArrayCopy[j + 1]
                userArrayCopy[j + 1] = temp
            }
        }
    }

    println("After Sorting without built-in function:")
    println(userArrayCopy.contentToString())
    println()
}