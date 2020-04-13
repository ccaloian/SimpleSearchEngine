import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val vowels = mutableMapOf<Char, Int>().withDefault { 0 }
    vowels['a'] = 1
    vowels['e'] = 5
    vowels['i'] = 9
    vowels['o'] = 15
    vowels['u'] = 21
    val letter = scanner.next().first()
    print(vowels.getValue(letter.toLowerCase()))
}