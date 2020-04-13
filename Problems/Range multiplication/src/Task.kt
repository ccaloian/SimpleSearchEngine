//val lambda: (Long, Long) -> Long = { a: Long, b: Long ->
//    var prod = 1L
//    for (e in a..b) prod *= e
//    prod
//}

import java.io.File

fun countNumbers(line: List<String>): Int {
    var numNumbers = 0
    for (w in line) {
        numNumbers += when(w.toIntOrNull()) {
            null -> 0
            else -> 1
        }
    }
    return numNumbers
}

fun main() {
    var longest = 0
    val fileName1 = "/Users/cristiancaloian/Desktop/words_sequence.txt"
    File(fileName1).forEachLine { l -> if (l.length > longest) longest = l.length }
    println(longest)

    var numWords = 0
    val fileName2 = "/Users/cristiancaloian/Desktop/text.txt"
    File(fileName2).forEachLine { l -> numWords += l.split(" ").size }
    println(numWords)

    var numNumbers = 0
    val fileName3 = "/Users/cristiancaloian/Desktop/words_with_numbers.txt"
    File(fileName3).forEachLine {
        numNumbers += countNumbers(it.split(" "))
    }
    println(numNumbers)
}
