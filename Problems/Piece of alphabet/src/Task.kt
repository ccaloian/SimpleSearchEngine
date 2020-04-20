fun main() {
    val input = readLine()!!
    var ans = true
    if (input.isNotEmpty() && input.length > 1) {
        for (i in 1 until input.length) {
            ans = ans && input[i] == input[i - 1] + 1
        }
    }
    print(ans)
}
