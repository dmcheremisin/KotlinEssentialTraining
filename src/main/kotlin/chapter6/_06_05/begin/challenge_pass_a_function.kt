package chapter6._06_05.begin

fun replicate(func: (Int, String) -> Unit) {
    func(3, "Be Cool.")
}

fun main() {
    // call replicate() here
    val printLines = fun(num: Int, str: String) {
        for (i in 1..num)
            println(str)
    }
    replicate(printLines)

    replicate { num, str ->
        for (i in 1..num)
            println(str)
    }
}
