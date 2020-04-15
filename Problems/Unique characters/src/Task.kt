fun main() {
    val word = readLine()!!
    val dict = mutableMapOf<Char, Int>().withDefault { 0 }
    for (char in word) {
        dict[char] = dict.getValue(char) + 1
    }
    dict.entries.retainAll { it.value == 1 }
    print(dict.size)
}