fun main() {
    val input = readLine()!!.toCharArray()
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
    val vowelConsonants = Array<Char>(input.size) {'x'}

    for (i in input.indices) {
        if (input[i] in vowels) vowelConsonants[i] = 'v'
        else vowelConsonants[i] = 'c'
    }

    val counts = ArrayList<Int>()
    var currCount = 1
    for (i in 1 until vowelConsonants.size) {
        if (vowelConsonants[i - 1] == vowelConsonants[i]) {
            currCount++
            continue
        }
        counts.add(currCount)
        currCount = 1
    }
    counts.add(currCount)

    var inserts = 0
    counts.forEach { if (it > 2) inserts += (it / 2) + (it % 2) - 1 }

    print(inserts)
}
