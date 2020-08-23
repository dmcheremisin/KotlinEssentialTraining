package chapter3._03_05.begin

data class Person(var firstName: String, var lastName: String)

fun main() {
    //val person1: Person = null
    val person1: Person? = null

    val greeting: String? = "Hello there"
    if (greeting != null)
        println("Joe says: $greeting") // Joe says: Hello there

    val greetingNull: String? = null
    //println("Greeting length ${greeting.length}")
    println("Greeting length ${greetingNull?.length}") // Greeting length null

    val len = greeting?.length ?: 0 // ?: ==> length or 0
    println("Length not null: ${len}") // Length not null: 11

    val lenNull = greetingNull?.length ?: 0
    println("Length of null: ${lenNull}") // Length of null: 0

    //val badLen = greetingNull!!.length ==> KotlinNullPointerException

    val safeGreeting: String? = greeting as? String
    println("Safe greeting: ${safeGreeting}") // Safe greeting: Hello there

    val safeGreetingNull: String? = greetingNull as? String
    println("Safe null greeting: ${safeGreetingNull}") // Safe null greeting: null
}
