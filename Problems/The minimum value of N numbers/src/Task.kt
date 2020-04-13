import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var minValue = scanner.nextInt()
    for (i in 1 until n) {
        val curr = scanner.nextInt()
        if (curr < minValue) minValue = curr
    }
    print(minValue)
}
