import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var currSeqLen = 1
    var maxSeqLen = 1
    var curr = scanner.nextInt()
    for (i in 2..n) {
        val next = scanner.nextInt()
        if (curr <= next) currSeqLen += 1
        else currSeqLen = 1
        maxSeqLen = Math.max(maxSeqLen, currSeqLen)
        curr = next
    }
    println(maxSeqLen)
}
