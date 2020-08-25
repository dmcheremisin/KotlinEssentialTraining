package chapter4._04_06.begin

fun main() {
    val result = (100 until 200).asSequence()
        .map { println("doubling $it"); it * 2 }
        .filter { println("filtering $it"); it % 3 == 0 }
        .first()
    println("results = $result")
    println()

    val seq = sequenceOf(1, 2, 3, 4, 5, 6).filter { it % 3 == 0 }
    println(seq)//kotlin.sequences.FilteringSequence@1efbd816
    println(seq.toList()) // [3, 6]
}
