import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Программа для нахождения суммы положительных чисел кратных m")
    println("Введите m: ")
    val m = scanner.nextInt()

    when {
        m <= 0 -> println("Число должно быть положительным")
        else -> {
            println("И которые принадлежат отрезку a, b. Введите a и b при a < b")
            val a = scanner.nextInt()
            val b = scanner.nextInt()
            when {
                a >= b || a <= 0 -> println("Число должно быть положительным и a > b")
                else -> {
                    val sum = sumOfMultiples(m, a, b)
                    println("Сумма таких чисел = $sum")
                }
            }
        }
    }
}

fun sumOfMultiples(m: Int, a: Int, b: Int): Int {
    var sum = 0
    for (n in a..b) {
        if (n % m == 0) { //нахолим сумму, нам нужны четные поэтому сравниваем остаток от деления с 0
            sum += n
        }
    }
    return sum
}
// until не берет верхний уровень, в отличие от ..