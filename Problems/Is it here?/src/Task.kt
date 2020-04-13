import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val array = IntArray(size) {scanner.nextInt()}
    val num = scanner.nextInt()
    if (array.find { it == num } != null) print("YES")
    else print("NO")
}
