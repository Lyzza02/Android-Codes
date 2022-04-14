fun main() {
    val colors = listOf("green", "orange", "blue")

    //this will cause an error
    colors.add("purple")
    colors[0] = "yellow"
}