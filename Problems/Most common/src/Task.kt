import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    var curr = scanner.next()
    if (curr == "stop") print(null)
    else {
        var mostFrequent: String = "stop"
        var highestFrequency = 0
        val words = mutableMapOf<String, Int>().withDefault { 0 }

        do {
            words[curr] = words.getValue(curr) + 1
            if (words[curr]!! > highestFrequency) {
                mostFrequent = curr
                highestFrequency = words.getValue(curr)
            }
            curr = scanner.next()
        } while (curr != "stop")

        print(mostFrequent)
    }
}
