package chapter4._04_02.begin

fun main() {
    val names = listOf("Dima", "Anya", "Mark", "Taya")
    println("The first name is ${names.get(0)}")
    println("The first name is ${names[0]}")
    //names[0] = "Vasya" => not allowed

    val subList = names.subList(1, 3)
    println(subList) // [Anya, Mark]

    val mutableList = mutableListOf(1, 2, 10, 5, 8, 13, 21)
    mutableList[2] = 3
    println(mutableList) // [1, 2, 3, 5, 8, 13, 21]

    mutableList.removeAt(1)
    println(mutableList) // [1, 3, 5, 8, 13, 21]

    mutableList.remove(199) // remove element not index, if index -> out of bounds error
    println(mutableList) // [1, 3, 5, 8, 13, 21]

    println("The first element is ${mutableList.first()}") // The first element is 1
    println("The last element is ${mutableList.last()}") // The last element is 21

}

