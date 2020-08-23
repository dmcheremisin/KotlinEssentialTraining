package chapter3._03_01.begin

fun returnsNothing() {
    println("In returnsNothing() function")
}

fun main() {
    val bigger = 100
    val smaller = 10
    //val won = bigger > smaller ? bigger : smaller;
    val won = if (bigger > smaller) bigger else smaller
    println(won) // 100

    val age = 35
    val boardGroup = when (age) {
        in 0..18 -> "young"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("You are in $boardGroup group")

    val returnNothing = returnsNothing()
    println("Returns nothing function: $returnNothing")

    //100
    //You are in regular group
    //In returnsNothing() function
    //Returns nothing function: kotlin.Unit
}
