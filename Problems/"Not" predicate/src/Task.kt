//val notPredicate: (Char) -> Boolean = {
//    it -> !originalPredicate(it)
//}

fun first(value: Int, func: (Int) -> Int): Int = func(value)
fun second(func: (Int) -> Int, value: Int): Int = func(value)

fun main() {
    first(5) { i -> i }
    first(5) { it }

    second({ i -> i }, 5)
    second({ it }, 5)
}