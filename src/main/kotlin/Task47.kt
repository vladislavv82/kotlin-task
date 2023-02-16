import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введите значение a: ")
    val a = scanner.nextDouble()
    var i = 1
    var num = 1.0
    println("$i %.4f ${num > a}".format(num))

    while (num <= a) {
        i++
        num += 1.0 / i
        println("$i %.4f ${num > a}".format(num))
    }
    println("\nПервое число последовательности > a = $num")
}