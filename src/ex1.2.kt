open class Product(
    val productName: String,
    val quantity: Int,
    val amountPerQuantity: Double
){
    init{
        println("Product Primary Constructor called")
    }
    constructor(productName: String) : this(productName, 0, 0.0) {
        println("Secondary Constructor called")
    }

    constructor(productName: String,quantity: Int) : this(productName, quantity, 0.0) {
        println("Product Secondary Constructor -2 parameters called")
    }

    fun getProductInfo() : String {
        return "Product: $productName , Quantity: $quantity ,Price per unit:$amountPerQuantity"
    }

    fun getTotalAmount() : Double {
        return quantity * amountPerQuantity
    }
}

class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Double,
    val cpuName : String,
    val ramSize: String,
    val hddSize : String
) : Product(productName, quantity, amountPerQuantity){
    init{
        println("Laptop Primary Constructor called")
    }
    constructor(
        productName: String,
        quantity: Int,
        cpuName: String,
    ): this(productName,quantity,0.0,cpuName,"8GB","256GB"){
        println("Laptop Secondary Constructor - quantity and CPU called")
    }

    fun getLaptopConfig(): String {
        return "CPU: $cpuName, RAM: $ramSize, HDD: $hddSize"
    }

    fun displayFullInfo(){
        println("Product Name: $productName")
        println("Quantity: $quantity")
        println("Amount per Quantity: $amountPerQuantity")
        println("Cpu: $cpuName")
        println("Ram size: $ramSize")
        println("Hdd size: $hddSize")
        println("Total Amount: ${getTotalAmount()}")
        println("-".repeat(50))
    }
}

fun main() {

    println("Creating 5 Laptops in ArrayList\n")

    val laptopList = arrayListOf<Laptop>()

    val laptop1 = Laptop("Dell XPS", 5, 120000.0, "Intel i7", "16GB", "512GB SSD")
    laptopList.add(laptop1)
    println()

    val laptop2 = Laptop("HP Pavilion", 3, 85000.0, "AMD Ryzen 5", "8GB", "256GB SSD")
    laptopList.add(laptop2)
    println()

    val laptop3 = Laptop("Lenovo ThinkPad", 4, 95000.0, "Intel i5", "12GB", "512GB SSD")
    laptopList.add(laptop3)
    println()

    val laptop4 = Laptop("ASUS ROG", 2, 150000.0, "Intel i9", "32GB", "1TB SSD")
    laptopList.add(laptop4)
    println()

    val laptop5 = Laptop("MacBook Pro", 2, 180000.0, "Apple M1", "16GB", "256GB SSD")
    laptopList.add(laptop5)
    println()

    println("\n" + "*".repeat(50))
    println("DISPLAYING ALL LAPTOPS INFORMATION")
    println("*".repeat(50) + "\n")

    for (i in laptopList.indices) {
        println("Laptop ${i + 1}:")
        laptopList[i].displayFullInfo()
    }

}