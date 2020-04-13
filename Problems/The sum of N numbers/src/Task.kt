import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 0
    repeat(n) {
        sum += scanner.nextInt()
    }
    print(sum)
}
