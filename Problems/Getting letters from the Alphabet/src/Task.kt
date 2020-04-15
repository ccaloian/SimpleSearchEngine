import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.next().first()
    for (letter in 'a'..'z') {
        if (input == letter) return
        print(letter)
    }
}
