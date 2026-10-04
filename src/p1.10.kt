class Car(
    val type: String,
    val model: Int,
    val owner: String,
    var milesDriven: Int,
    val originalPrice: Double,
    var currentPrice: Double
) {

    init {
        println("Object of class is created and Init is called.")
        println("-".repeat(50))
    }

    fun displayCarInfo() {
        println("\nCar Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Driven: $milesDriven")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: $currentPrice")
        println("-".repeat(50))
    }
}

fun main() {

    println("Creating Car Class Object car1")
    println()

    val car1 = Car(
        type = "BMW",
        model = 2018,
        owner = "Aman",
        milesDriven = 105,
        originalPrice = 100000.0,
        currentPrice = 98950.0
    )

    car1.displayCarInfo()

    println()

    println("Creating Car Class Object car2")

    val car2 = Car(
        type = "BMW",
        model = 2019,
        owner = "Karan",
        milesDriven = 20,
        originalPrice = 400000.0,
        currentPrice = 399800.0
    )

    car2.displayCarInfo()

    println()

    println("****** ArrayList of Car **********")

    val carList = arrayListOf<Car>()

    println("Creating Car Class Object car3")

    val car3 = Car(
        type = "Toyota",
        model = 2017,
        owner = "KJS",
        milesDriven = 100,
        originalPrice = 1080000.0,
        currentPrice = 1079000.0
    )

    carList.add(car3)

    car3.displayCarInfo()

    println()

    println("Creating Car Class Object car4")

    val car4 = Car(
        type = "Maruti",
        model = 2020,
        owner = "NRP",
        milesDriven = 200,
        originalPrice = 4000000.0,
        currentPrice = 3998000.0
    )

    carList.add(car4)

    car4.displayCarInfo()

    println()

    println("All Cars in ArrayList:")
    println()

    for (car in carList) {
        println("Car Type: ${car.type}, Model: ${car.model}")
        println("Owner: ${car.owner}")
        println("Miles Driven: ${car.milesDriven}")
        println("Original Price: ${car.originalPrice}")
        println("Current Price: ${car.currentPrice}")
        println("-".repeat(50))
    }
}