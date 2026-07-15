open class Person(
    val firstName: String,
    val lastName: String,
    var age: Int
){
    init{
        println("Person Primary Constructor called")
    }

    constructor(firstName: String, lastName: String) : this(firstName, lastName, 0) {
        println("Person Constructor -2 parameters called")
    }

    constructor(firstName: String) : this(firstName, "", 0) {
        println("Person Constructor -1 parameters called")
    }
    fun getPersonInfo() : String{
        return "Name: $firstName $lastName,Age: $age"
    }
}
class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String,
    val branch: String,
    val classSection: String,
    val labBatch: String,
): Person(firstName, lastName, age){
    init{
        println("Student Primary Constructor called")
    }
    constructor(
        firstName: String,
        lastName: String,
        enrollmentNo: String
    ) : this(firstName, lastName, 0, enrollmentNo, "CSE", "A", "Batch-1") {
        println("Student Constructor - name and enrollment called")
    }

    constructor(
        firstName: String,
        lastName: String,
        age: Int,
        enrollmentNo: String
    ) : this(firstName, lastName, age, enrollmentNo, "CSE", "A", "Batch-1") {
        println("Student Constructor - name, age and enrollment called")
    }

    fun displayStudentInfo() {
        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Age: $age")
        println("Enrollment No: $enrollmentNo")
        println("Branch: $branch")
        println("Class: $classSection")
        println("Lab Batch: $labBatch")
        println("-".repeat(50))
    }
}


fun main() {

    println("Creating 5 Students in ArrayList\n")

    val studentList = arrayListOf<Student>()

    val student1 = Student("Rutul", "Patel", 20, "2023001", "CSE", "A", "Batch-1")
    studentList.add(student1)
    println()

    val student2 = Student("Aman", "Singh", 19, "2023002", "CSE", "B", "Batch-2")
    studentList.add(student2)
    println()

    val student3 = Student("Karan", "Verma", 20, "2023003", "IT", "A", "Batch-1")
    studentList.add(student3)
    println()

    val student4 = Student("Priya", "Sharma", 19, "2023004", "CSE", "C", "Batch-3")
    studentList.add(student4)
    println()

    val student5 = Student("Neha", "Gupta", 20, "2023005", "IT", "B", "Batch-2")
    studentList.add(student5)
    println()

    println("\n" + "*".repeat(50))
    println("DISPLAYING ALL STUDENTS INFORMATION")
    println("*".repeat(50) + "\n")

    for (i in studentList.indices) {
        println("Student ${i + 1}:")
        studentList[i].displayStudentInfo()
    }
}