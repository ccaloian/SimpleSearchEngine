import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val array = IntArray(size)
    for (i in 0..array.lastIndex) array[i] = scanner.nextInt()
    val rotation = scanner.nextInt() % size
    val rotated = array.takeLast(rotation) + array.take(size - rotation)
    print(rotated.joinToString(" "))
}
