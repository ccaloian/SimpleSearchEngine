import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }

    var firstMaxIx = 0
    var currMax = Int.MIN_VALUE
    for (i in array.indices) {
        if (currMax < array[i]) {
            currMax = array[i]
            firstMaxIx = i
        }
    }

    print(firstMaxIx)
}
