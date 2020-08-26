package chapter6._06_03.begin

fun main() {
    val num = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val fNum = num.filter(fun(a: Int): Boolean { return a < 7 })
    println(fNum) // [1, 2, 3, 4, 5, 6]

    val fNum2 = num.filter(fun(a) = a < 7)
    println(fNum2) // [1, 2, 3, 4, 5, 6]

    val getDiscount = lambda@{age: Int ->
        if(age >= 65)
            return@lambda "senior discount"
        else if(age >= 21)
            return@lambda "regular"
        "underage"
    }
    println(getDiscount(32)) // regular

    val funGetDiscount = fun(age: Int):String {
        if(age >= 65)
            return "senior discount"
        else if(age >= 21)
            return "regular"
        return "underage"
    }
    println(funGetDiscount(32)) // regular
}
