package chapter6._06_04.begin

fun main() {
    val words = listOf("racecar", "civic", "level", "butter")
    for (word in words)
        println("$word is palindrome? ${isPalindrome(word)}")
    //racecar is palindrome? true
    //civic is palindrome? true
    //level is palindrome? true
    //butter is palindrome? false

    words.forEach { println("$it is palindrome? ${isPalindrome(it)}") }
}

fun isPalindrome(word: String): Boolean {
    fun doCharsMatch(front: Int, back: Int): Boolean {
        if (front >= back) return true
        if (word[front].toUpperCase() != word[back].toUpperCase()) return false
        return doCharsMatch(front + 1, back - 1)
    }
    if (word.length < 2) return true
    return doCharsMatch(0, word.lastIndex)
}
