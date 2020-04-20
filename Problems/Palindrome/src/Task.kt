fun main() {
    val input = readLine()!!
    val palindrome = input == input.reversed()
    print(if (palindrome) "yes" else "no")
}
