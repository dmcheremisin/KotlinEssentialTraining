package chapter6._06_01.begin

fun main() {
    println(greeter("Troy")) // Hello Troy
    println(greeter2("Troy"))// Hello Troy
    println(volume(1, 2, 3)) // 6
    println(volumeWithDefault(1, 2)) // 20
    println(volumeX(width = 2, height =  3)) // 60
}

fun greeter(name: String): String {
    return "Hello $name"
}

fun greeter2(name: String) = "Hello $name"

fun volume(length: Int, width: Int, height: Int) = length * width * height
fun volumeWithDefault(length: Int, width: Int, height: Int = 10) = length * width * height

fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height