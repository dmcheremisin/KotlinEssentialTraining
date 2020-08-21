package chapter2._02_04.begin

fun main() {
    val greeting = "Hello there"
    val owe = 50

    val janet = "I owe Janet \$$owe dollars"
    println(janet)

    val infinity = "The infinity symbol is \u221E"
    println(infinity)

    println("[$greeting] is ${greeting.length} characters long")

    var bad = greeting.get(2)
    val letter = greeting[1]
    println("Bad: $bad")
    println("Letter: $letter")

    val compare1 = "beta"
    val compare2 = "alpha"

    println("${compare1.compareTo(compare2)}")

    val sub = greeting.subSequence(6, 9)
    println("sub = $sub")

    for (single in greeting)
        print("$single ")

    val myString = """
        Kotlin is fun
        Kotlin is pragmatic
    """

    println(myString)

    //I owe Janet $50 dollars
    //The infinity symbol is ∞
    //[Hello there] is 11 characters long
    //Bad: l
    //Letter: e
    //1
    //sub = the
    //H e l l o   t h e r e
    //        Kotlin is fun
    //        Kotlin is pragmatic
}
