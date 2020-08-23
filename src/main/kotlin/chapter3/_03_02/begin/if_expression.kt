package chapter3._03_02.begin

fun main() {

    val bigger = 100;
    val smaller = 10;
    val won = if (bigger > smaller) bigger else smaller;
    println("Won: $won")

    if (bigger > 10)
        println("Greater than 10")
    else if (bigger > 100)
        println("Greater than 100")
    else
        println("Not too big")

    val number = 121
    val bucket =
        if (number > 100) {
            "alpha"
        } else if (number > 90) {
            90
        } else if (number > 10) {
            "ten"
        } else {
            0
        }
    println("Bucket: $bucket")

    //Won: 100
    //Greater than 10
    //Bucket: alpha

}
