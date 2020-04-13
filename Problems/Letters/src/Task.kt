import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val letters = mutableMapOf<Int ,Char>()
    var ix = 0
    do {
        ix++
        letters[ix] = scanner.nextLine().first()
        // println("letters[$ix]: ${letters[ix]}")
    } while (letters[ix] != 'z')
    if (letters.size < 4) print(null)
    else print(letters[4])
}
