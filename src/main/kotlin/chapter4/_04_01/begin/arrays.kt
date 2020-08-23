package chapter4._04_01.begin

data class Student(val firstName: String, val grade: Int)

fun fiver(index: Int): Int {
    return index * 5;
}

fun main() {
    val things = arrayOf(1, 2, 3, "one", "two", "three")
    things[0] = "zero"
    for (thing in things)
        println(thing)
    //zero
    //2
    //3
    //one
    //two
    //three

    val students = arrayOf<Student>(Student("Todd", 5), Student("Mike", 6));
    students[1] = Student("James", 4)
    //students[0] = "not valid type"
    for (student in students)
        println(student)
    //Student(firstName=Todd, grade=5)
    //Student(firstName=James, grade=4)

    val fives = Array(5, ::fiver)
    fives.forEach { println(it) }
    //0
    //5
    //10
    //15
    //20

    println("fives has ${fives.size} elements") // fives has 5 elements
    println("fives has indices ${fives.indices}") // fives has indices 0..4
    println("fives has last index ${fives.lastIndex}") // fives has last index 4

    val pInts = intArrayOf(1, 2, 3)
    pInts.forEach { println(it) }
    //1
    //2
    //3
}

