import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nCompanies = scanner.nextInt()
    val incomes = IntArray(nCompanies) { scanner.nextInt() }
    val taxesInProc = IntArray(nCompanies) { scanner.nextInt() }
    val taxes = DoubleArray(nCompanies) {
        i -> incomes[i].toDouble() * taxesInProc[i].toDouble() / 100
    }
    print(taxes.indexOf(taxes.max()!!) + 1)
}