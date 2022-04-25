fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    var filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)

    filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
    println(filteredWords)

    filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
    .take(2)
    println(filteredWords)
}