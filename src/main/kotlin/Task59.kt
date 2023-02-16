import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Программа для нахождения значения функции")
    println("Введите целые x и n, при n >= 2 и n <=5")
    val x = Integer.parseInt(sc.nextLine())
    val n = Integer.parseInt(sc.nextLine())
    if (n >= 2 && n <= 5) {
        val itog = func(x, n) //вызываем func передаём x, n
        println("Ответ: $itog") //форматированный вывод
    } else {
        println("Некорректные данные")
    }
}

fun func(x: Int, n: Int): Double { //логика вычисления тут
    var s = 0.0
    when (n) {
        2 -> s = (1 + Math.cos(2 * x.toDouble())) / 2
        3 -> s = (3 * Math.cos(x.toDouble()) + Math.cos(3 * x.toDouble())) / 4
        4 -> s = (3 + 4 * Math.cos(2 * x.toDouble()) + Math.cos(4 * x.toDouble())) / 8
        5 -> s = (10 * Math.cos(x.toDouble()) + 5 * Math.cos(3 * x.toDouble()) + Math.cos(5 * x.toDouble())) / 16
    }
    return s
}