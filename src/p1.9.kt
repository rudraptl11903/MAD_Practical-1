fun main(){

    val arrayList = arrayListOf(77, 90, 40, 15, 74)

    println("Displaying elements:")
    for (i in arrayList.indices) {
        println("a[$i]=${arrayList[i]}")
    }
    println()

    val max = arrayList.maxOrNull()
    println("Largest element =$max")
}