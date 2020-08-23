package chapter3._03_04.begin

fun main() {

    for (i in 1..10)
        println("i = $i")

    val students = listOf("Janet", "Daisy", "Veronica", "Fernanda")
    for (student in students)
        println("Current student: $student")

    for ((index, student) in students.withIndex())
        println("Student with index ${index + 1} is $student")

    println("while")
    var count = 5
    while (count > 0) {
        println(count)
        count--
    }

    println("do while")
    do {
        println(count)
        count++
    } while (count < 5)

    println("break")
    while (count > 0) {
        if (count % 2 == 0) break
        println(count)
        count++
    }

}
