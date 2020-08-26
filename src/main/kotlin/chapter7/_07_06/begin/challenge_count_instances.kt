package chapter7._07_06.begin

class Bosco {

    init {
        incrementInstances()
    }

    companion object {
        private var instances = 0

        fun incrementInstances() {
            instances++
        }

        fun show() {
            println(instances)
        }
    }
}

fun nop() {
    val b = Bosco()
}

fun main() {
    val b1 = Bosco()
    val b2 = Bosco()
    nop()
    val b3 = Bosco()
    Bosco.show()
}
