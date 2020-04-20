fun main() {
    val input = readLine()!!
    val firsHalf = input.substring(0, (input.length / 2))
    val secondHalf = input.substring((input.length / 2))
    var a = 0
    for (ch in firsHalf) a += ch.toInt()
    var b = 0
    for (ch in secondHalf) b += ch.toInt()
    if (a == b) print("YES")
    else print("NO")
}
