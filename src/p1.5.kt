fun main() {
    println("Enter month")
    val month = readln().toInt()

    val month_name = when (month){
        1 -> "january"
        2 -> "february"
        3 -> "march"
        4 -> "april"
        5 -> "may"
        6 -> "june"
        7 -> "july"
        8 -> "august"
        9 -> "september"
        10 -> "oct"
        11 -> "nov"
        12 -> "dec"
        else -> "please enter proper number "
    }
    println(month_name)
}