import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val shipsXY = Array<Int>(6) { scanner.nextInt() }
    val rows = MutableList<Int>(5) { 0 }
    val cols = MutableList<Int>(5) { 0 }

    for (i in shipsXY.indices) {
        // X coordinate
        if (i % 2 == 0) {
            rows[shipsXY[i] - 1] = 1
        }
        // Y coordinate
        else {
            cols[shipsXY[i] - 1] = 1
        }
    }

    val freeRows = mutableListOf<Int>()
    val freeCols = mutableListOf<Int>()
    for (i in rows.indices) {
        if (rows[i] != 1) freeRows.add(i + 1)
    }
    for (i in cols.indices) {
        if (cols[i] != 1) freeCols.add(i + 1)
    }

    println(freeRows.joinToString(" "))
    print(freeCols.joinToString(" "))
}

/* Much nicer solution

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val x = IntArray(5) { it + 1 }
    val y = IntArray(5) { it + 1 }
    repeat(3) {
        x[input.nextInt() - 1] = 0
        y[input.nextInt() - 1] = 0
    }
    println(x.filter { it != 0 }.joinToString(" "))
    println(y.filter { it != 0 }.joinToString(" "))
}

 */