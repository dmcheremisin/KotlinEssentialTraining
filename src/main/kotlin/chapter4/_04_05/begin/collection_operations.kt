package chapter4._04_05.begin

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val set = setOf(10, 20, 30, 40, 50)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

    val tList = list.map { it * 2 }
    println("Transformed list =  $tList") // [2, 4, 6, 8, 10, 10, 12, 14, 14, 16]

    val tmap = map.map { Pair(it.key, it.value * 10) }.toMap()
    println("Transformed map = $tmap") // {1=100, 2=200, 3=300}

    val fList = list.filter { it % 2 == 1 }
    println("Only odds = $fList") // [1, 3, 5, 5, 7, 7]

    val fSet = set.filter { it > 30 }
    println("Only > 30 values of set = $fSet") // [40, 50]

    println("Sorted descending values of set = ${set.sortedDescending()}") // [50, 40, 30, 20, 10]

    println("tList last > 10 value = ${tList.last { it > 2 }}") // tList last > 10 value = 16
}
