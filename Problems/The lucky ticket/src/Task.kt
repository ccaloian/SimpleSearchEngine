fun main() {
    val input = readLine()!!
    var firstHalfSum = 0
    var secondHalfSum = 0
    input.substring(0, 3).forEach { firstHalfSum += it.toString().toInt() }
    input.substring(3).forEach { secondHalfSum += it.toString().toInt() }
    print(if (firstHalfSum == secondHalfSum) "Lucky" else "Regular")
}
