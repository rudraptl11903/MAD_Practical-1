open class Person(
    val firstName: String,
    val lastName: String,
    var age: Int
) {

    // Primary Constructor
    init {
        println("Person Primary Constructor called")
    }

    // Secondary Constructor - 2 parameters
    constructor(
        firstName: String,
        lastName: String
    ) : this(firstName, lastName, 0) {
        println("Person Constructor - 2 parameters called")
    }

    // Secondary Constructor - 1 parameter
    constructor(
        firstName: String
    ) : this(firstName, "", 0) {
        println("Person Constructor - 1 parameter called")
    }

    // Person Information
    fun getPersonInfo(): String {
        return "Name: $firstName $lastName, Age: $age"
    }
}


// Student Class inherits Person
class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String,
    val branch: String,
    val classSection: String,
    val labBatch: String
) : Person(firstName, lastName, age) {

    // Primary Constructor
    init {
        println("Student Primary Constructor called")
    }

    // Secondary Constructor - name and enrollment
    constructor(
        firstName: String,
        lastName: String,
        enrollmentNo: String
    ) : this(
        firstName,
        lastName,
        0,
        enrollmentNo,
        "CSE",
        "A",
        "Batch-1"
    ) {
        println("Student Constructor - name and enrollment called")
    }

    // Secondary Constructor - name, age and enrollment
    constructor(
        firstName: String,
        lastName: String,
        age: Int,
        enrollmentNo: String
    ) : this(
        firstName,
        lastName,
        age,
        enrollmentNo,
        "CSE",
        "A",
        "Batch-1"
    ) {
        println("Student Constructor - name, age and enrollment called")
    }

    // Display Student Information
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


// Main Function
fun main() {

    println("Creating 5 Students in ArrayList\n")

    val studentList = arrayListOf<Student>()

    // Student 1
    val student1 = Student(
        "OM",
        "Patel",
        20,
        "2023001",
        "CSE",
        "A",
        "Batch-1"
    )

    studentList.add(student1)

    println()

    // Student 2
    val student2 = Student(
        "Aman",
        "Singh",
        19,
        "2023002",
        "CSE",
        "B",
        "Batch-2"
    )

    studentList.add(student2)

    println()

    // Student 3
    val student3 = Student(
        "Karan",
        "Verma",
        20,
        "2023003",
        "IT",
        "A",
        "Batch-1"
    )

    studentList.add(student3)

    println()

    // Student 4
    val student4 = Student(
        "Priya",
        "Sharma",
        19,
        "2023004",
        "CSE",
        "C",
        "Batch-3"
    )

    studentList.add(student4)

    println()

    // Student 5
    val student5 = Student(
        "Neha",
        "Gupta",
        20,
        "2023005",
        "IT",
        "B",
        "Batch-2"
    )

    studentList.add(student5)

    println()

    // Display all students
    println("*".repeat(50))
    println("DISPLAYING ALL STUDENTS INFORMATION")
    println("*".repeat(50))
    println()

    for (i in studentList.indices) {

        println("Student ${i + 1}:")

        studentList[i].displayStudentInfo()
    }
}
