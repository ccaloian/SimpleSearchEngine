fun encode(input: String): String {
    if (input.isEmpty()) {
        return ""
    }
    else {
        var encoding = ""
        var curr = input.first()
        var count = 0
        for (ch in input) {
            if (ch == curr) {
                count++
            }
            else {
                encoding = encoding + curr + count.toString()
                curr = ch
                count = 1 // we've already seen one occurrence

            }
        }
        // flush the last characters
        encoding = encoding + curr + count.toString()
        return encoding
    }
}

fun main() {
    val input = readLine()!!
    print(encode(input))
}
