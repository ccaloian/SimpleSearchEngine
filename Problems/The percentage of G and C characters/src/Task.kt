fun main() {
    val input = readLine()!!
    val cgCount = input.toLowerCase().count { it == 'c' || it == 'g' }
    print((cgCount.toDouble() / input.length) * 100)
}
