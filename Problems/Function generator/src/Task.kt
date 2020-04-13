fun identity(arg: Int): Int = arg

fun half(arg: Int): Int = arg / 2

fun zero(arg: Int): Int = 0

fun generate(functionName: String): (Int) -> Int {
    return when(functionName) {
        "identity" -> ::identity
        "half" -> ::half
        "zero" -> ::zero
        else -> ::zero
    }
}
