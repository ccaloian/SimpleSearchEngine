import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val array = IntArray(size) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val nm = intArrayOf(n, m)
    val mn = intArrayOf(m, n)
    var res = "YES"
    for (i in 1..array.lastIndex) {
        val curr = array.sliceArray((i-1)..i)
        if (curr.contentEquals(nm) || curr.contentEquals(mn)) {
            res = "NO"
            break
        }
    }
    print(res)
}
