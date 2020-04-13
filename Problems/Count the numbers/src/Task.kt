import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var res = 0
    for (i in a..b) {
        if (i % n == 0) res += 1
    }
    println(res)
}
