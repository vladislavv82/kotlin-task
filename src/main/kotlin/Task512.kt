import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Программа для нахождения суммы положительных нечётных чисел меньше m")
    print("Введите m: ")
    val m = sc.nextInt()

    if (m > 0) {
        val sum = sumPositiveOddNumbers(m)
        println("Сумма таких чисел = $sum")
    } else {
        println("m должно быть больше 0")
    }
}

fun sumPositiveOddNumbers(m: Int): Int {
    var sum = 0
    for (n in 1 until m step 2) { //Чтобы перебрать диапазон чисел, который не включает его конечный элемент, используйте until
        sum += n //проходим по всем не четным с шагом 2, от 1 до m и вычисляем сумму
    }
    return sum
}

