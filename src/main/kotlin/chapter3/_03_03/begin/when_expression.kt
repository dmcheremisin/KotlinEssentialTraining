package chapter3._03_03.begin

enum class Suit {
    Club, Diamond, Heart, Spade
}

fun main() {
    val x = 3
    when(x) {
        1,2 -> println("One or two")
        3 -> println("Exactly three")
        4,5 -> println("Four or five")
    } // Exactly three

    val card = Suit.Spade
    val y = when(card) {
        Suit.Spade, Suit.Club -> println("Black card") // Black card
        Suit.Diamond, Suit.Heart -> println("Red card")
    }
    println(y) // kotlin.Unit

    val name = "Troy"
    val lastName = when(name) {
        "Hattan" -> "Shobokshi"
        "Todd" -> "Miller"
        "Troy" -> "Miles"
        else -> "Unknown"
    }
    println("$name $lastName") // Troy Miles
}
