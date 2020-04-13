import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val array = IntArray(size)
    for (i in 0..array.lastIndex) {
        array[(i+1) % size] = scanner.nextInt()
    }
    print(array.joinToString(" "))
}
