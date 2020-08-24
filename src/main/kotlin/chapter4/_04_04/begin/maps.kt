package chapter4._04_04.begin

fun main() {
    val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val m2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")

    println("m1 == m2? ${m1 == m2}") // true
    println("m1[1] = ${m1[1]}") // alpha
    println("m1[5] = ${m1.getOrDefault(5, "No value")}") // No value
    //m1.put(5, "dzetta") not supported

    val cars = mutableMapOf(
        "ford" to "mustang",
        "bmw" to "X5",
        "subaru" to "impreza"
    )
    cars["tesla"] = "modelX"
    println(cars) // {ford=mustang, bmw=X5, subaru=impreza, tesla=modelX}
    for(key in cars.keys)
        println(key)
    //ford
    //bmw
    //subaru
    //tesla

    println("has ford? ${"ford" in cars.keys}") // true
    println("has lada? ${"lada" in cars.keys}") // false
    println("has modelX? ${"modelX" in cars.values}") // true

    println("Remove subaru: ${cars.remove("subaru")}") // Remove subaru: impreza
}

