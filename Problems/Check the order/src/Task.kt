import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var curr = Int.MIN_VALUE
    var sorted = "YES"
    for (i in 1..n) {
        val next = scanner.nextInt()
        if (curr > next) {
            sorted = "NO"
            break
        }
        curr = next
    }
    print(sorted)
}
