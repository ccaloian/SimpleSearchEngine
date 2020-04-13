import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val char = scanner.next().first()
    println(char in '\u0031'..'\u0039' || char.isUpperCase())
}
