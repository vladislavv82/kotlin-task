import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите натуральное число:")
    val n = scanner.nextInt()

    var digit5 = false
    var number = n

    while (number > 0) {
        val digit = number % 10 //уменьшаем число делением на 10, если будет цифра 5 то она будет в остатке
        if (digit == 5) {
            digit5 = true
            break
        }
        number /= 10
    }

    if (digit5) { // если true
        println("Число $n содержит цифру 5")
    } else {
        println("Число $n не содержит цифру 5")
    }
}
