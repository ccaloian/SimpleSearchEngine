import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first()
    val second = scanner.next().first()
    val third = scanner.next().first()
    val fourth = scanner.next().first()
    println("${first.isDigit()}\\${second.isDigit()}\\${third.isDigit()}\\${fourth.isDigit()}")
}
