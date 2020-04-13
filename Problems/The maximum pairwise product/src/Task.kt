import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var largest = 1
    var secondLargest = 1
    repeat(n) {
        val curr = scanner.nextInt()
        if (largest < curr) {
            secondLargest = largest
            largest = curr
        }
        else if (secondLargest < curr) {
            secondLargest = curr
        }
    }
    print(largest * secondLargest)
}
