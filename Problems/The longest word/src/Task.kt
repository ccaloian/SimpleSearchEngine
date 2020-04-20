fun main() {
    val words = readLine()!!.split(" ")
    var longestWord: String = words[0]
    var maxSize: Int = 0
    for (word in words) {
        if (word.length > maxSize) {
            longestWord = word
            maxSize = word.length
        }
    }
    print(longestWord)
}
