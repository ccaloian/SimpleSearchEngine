import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first()
    val second = scanner.next().first()
    val third = scanner.next().first()
    println((first == second - 1) && (second == third - 1))
}
