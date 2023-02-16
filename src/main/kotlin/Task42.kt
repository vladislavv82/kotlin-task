import java.util.*
import kotlin.math.*

fun main() {
    println("Программа для вычисления выражения")
    val sc = Scanner(System.`in`)
    print("Введите число b: ")
    val b = sc.nextInt()

    if (b < 0) {
        var a = b   //toDouble?
        var i = 2
        while (a < 0) {
            a = ((a + abs(sin(i.toDouble()))) / (i - sin(i.toDouble()).pow(2))).toInt()
            i++
            println("a($i) = $a")
        }
        println("a = $a")
    } else {
        println("b должно быть меньше нуля")
    }
}