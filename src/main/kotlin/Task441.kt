import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введите значение натурального числа n: ")
    val n = scanner.nextInt()
    val sum = calculateSum(n)
    println("Сумма = $sum")
}

fun calculateSum(n:Int):Double{
    var sum = 0.0
    var fact = 1.0
    for (i in 1..n) {
        fact *= i
        sum += (-1.0).pow(i) * (i + 1) / fact
    }
    return sum
}

//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    print("Введите значение натурального числа n: ")
//    val n = scanner.nextInt()
//
//    val sum = calculateSum(n)
//    println("Сумма = $sum")
//}
//
//fun calculateSum(n: Int): Double {
//    var sumi = 0.0
//    for (i in 1..n) {
//        var sumj = 0.0
//        for (j in 1..i) {
//            sumj += 1.0/j
//        }
//        val fact = (1..i).fold(1.0) { acc, num -> acc * num }
//        sumi += fact / sumj
//    }
//    return sumi
//}
//
