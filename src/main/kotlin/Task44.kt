import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Число x начальное = ")
    var x = sc.nextDouble()
    print("Введите шаг = ")
    val h = sc.nextDouble()

    var f = 0.0
    val e = 2.718 //???

    if (x <= 0) {
        while (e.pow(0.2) < (5 * abs(x))) {
            f += calculateFunction(x)
            x += h
        }
    } else {
        println("Число должно быть меньше или равно 0")
        return
    }

    println(f)
}

fun calculateFunction(x: Double): Double { //логика тут
    val e = 2.718
    return (e.pow(0.2 * x) + sqrt(e.pow(0.2 * x)).pow(3) + sqrt(e.pow(0.2 * x)).pow(5))
}