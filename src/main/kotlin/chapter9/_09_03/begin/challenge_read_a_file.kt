package chapter9._09_03.begin

import kotlinx.coroutines.*
import java.io.File

fun asyncReader() = runBlocking {
    val fileLines = async {readFile()}
    fileLines.await().forEach({println(it)})
}

fun readFile (): List<String> {
    val file = File("./resources/text.txt")
    return file.readLines()
}

fun main() {
    asyncReader()
    //1 alpha
    //2 beta
    //3 gamma
    //4 delta
    //5 epsilon
}