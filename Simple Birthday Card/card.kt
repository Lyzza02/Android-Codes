fun main() {
    
    val age = 5 * 365
    val name = "Rover"
    
    printBorder()
    println("Happy Birthday, ${name}!")
    printBorder()
    
    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    
    // This prints an empty line.
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}

fun printBorder() {
    repeat(23) {
        print("=")
    }
    println()
}