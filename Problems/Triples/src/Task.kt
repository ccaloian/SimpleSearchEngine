import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }

    var numTriples = 0
    for (i in 2..array.lastIndex) {
        if ((array[i-1] == array[i-2] + 1) && (array[i] == array[i-1] + 1)) {
            numTriples++
        }
    }
    print(numTriples)
}
