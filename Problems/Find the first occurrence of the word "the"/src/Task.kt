fun main() {
    val input = readLine()!!
    val lengthBefore = input.toLowerCase().substringBefore("the").length
    print(if (lengthBefore == input.length) -1 else lengthBefore)
}

