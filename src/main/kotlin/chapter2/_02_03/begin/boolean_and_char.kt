package chapter2._02_03.begin

fun firstOperand(): Boolean {
    println("firstOperand")
    return false;
}

fun secondOperand(): Boolean {
    println("secondOperand")
    return true;
}

private fun demoBoolean() {
    var willExercise: Boolean = false
    val bigNumber = 1_000_000
    val smallNumber = 2

    println("Will exercise: ${willExercise}")
    println("Is bigNumber bigger ${bigNumber > smallNumber}")

    if(firstOperand() || secondOperand())
        println("At least one operand is true")

    if(firstOperand() && secondOperand())
        println("Both are true")

    println("Will exercise: ${!willExercise}")
}

private fun demoChar() {
    val letter: Char = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("Letter = $letter");
    println("Tabbed $tab over");
    println("Infinity = $infinity");

    val lineFeed = 10.toChar()
    println("line feed = $lineFeed next line")
}

fun main() {
    demoBoolean()
    println(" ========================== ")
    demoChar()
}

//Will exercise: false
//Is bigNumber bigger true
//firstOperand
//secondOperand
//At least one operand is true
//firstOperand
//Will exercise: true
// ==========================
//Letter = A
//Tabbed 	 over
//Infinity = ∞
//line feed =
// next line