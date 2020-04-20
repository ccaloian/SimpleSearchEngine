fun main() {
    val input = readLine()!!
    val pat = readLine()!!
    var count = 0
    for (i in (pat.length)..input.length) {
        if (input.substring(i - pat.length, i) == pat) count++
    }
    print(count)
}
