package chapter7._07_02.begin

class Vehicle(val make: String, val model: String, val year: Int, val state: String = "CA") {

    private var style = ""
    private var status = ""

    constructor(make: String, model: String, year: Int, state: String, style: String) :
            this(make, model, year, state) {
        this.style = style
    }

    constructor(make: String, model: String, year: Int, state: String, style: String, status: String) :
            this(make, model, year, state) {
        this.style = style
        this.status = status
    }

    init {
        println("First initializer block - $this")
    }

    override fun toString(): String {
        return "$year $make $model ($state)"
    }
}

fun main() {
    val car = Vehicle("Chevrolet", "Volt", 2018)
    println(car)
    //First initializer block - 2018 Chevrolet Volt (CA)
    //2018 Chevrolet Volt (CA)

    val car2 = Vehicle(state = "NV", year = 2019, make = "Ford", model = "Mustang")
    println(car2)
    //First initializer block - 2019 Ford Mustang (NV)
    //2019 Ford Mustang (NV)

    val car3 = Vehicle("Tesla", "Model S", 2019, "RI", "P100D")
    println(car3)
    //First initializer block - 2019 Tesla Model S (RI)
    //2019 Tesla Model S (RI)

    val car4 = Vehicle("Tesla", "Model 3", 2019, "Car", "Performance", "New")
    println(car4)
    //First initializer block - 2019 Tesla Model 3 (Car)
    //2019 Tesla Model 3 (Car)
}
