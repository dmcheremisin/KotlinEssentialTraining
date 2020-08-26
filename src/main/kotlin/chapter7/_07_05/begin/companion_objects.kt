package chapter7._07_05.begin

class CantCreate constructor(val message: String) {
    fun showMessage() {
        println(message)
    }

    companion object {
        const val LIGHT_SPEED = 299_792_458
        fun factory(msg: String): CantCreate {
            return CantCreate(msg)
        }

        fun sillyPrint(self: CantCreate) {
            println("Accessing ${self.message}")
        }
    }
}

fun main() {
    val c1 = CantCreate.factory("Hello, there")
    c1.showMessage()
    CantCreate.sillyPrint(c1)
    println("The speed of light is ${CantCreate.LIGHT_SPEED}")
    //Hello, there
    //Accessing Hello, there
    //The speed of light is 299792458
}
