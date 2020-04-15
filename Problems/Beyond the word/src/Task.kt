import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    for (letter in 'a'..'z') {
        if (input.contains(letter)) continue
        print(letter)
    }

}
