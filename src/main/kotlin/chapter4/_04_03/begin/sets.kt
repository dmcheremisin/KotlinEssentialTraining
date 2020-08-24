package chapter4._04_03.begin

fun main() {
    val threes = setOf(3, 3, 3, 3, 4)
    println(threes)
    println("The size is ${threes.size}")
    // threes.add(5) not exists method

    val mutableSet = mutableSetOf(1, 2, 3, 4)
    println(mutableSet) // [1, 2, 3, 4]
    mutableSet.add(5)
    println(mutableSet) // [1, 2, 3, 4, 5]

    val anotherSet = mutableSetOf(5, 4, 3, 2, 1)
    println("First are equal? ${mutableSet.first() == anotherSet.first()}") // false
    println("Sets are equal? ${mutableSet == anotherSet}") // true
    println("Sets are equal? ${mutableSet.equals(anotherSet)}") // true

    val set1 = hashSetOf(1, 2, 3, 4, 5)
    val set2 = hashSetOf(5, 4, 3, 2, 1)
    println("First are equal? ${set1.first() == set2.first()}") // true
    println("Sets are equal? ${set1 == set2}") // true
    println("Sets are equal? ${set1.equals(set2)}") // true
}
