import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите коэффициенты первой прямой:")
    val a1 = scanner.nextDouble()
    val b1 = scanner.nextDouble()
    val c1 = scanner.nextDouble()
    println("Введите коэффициенты второй прямой:")
    val a2 = scanner.nextDouble()
    val b2 = scanner.nextDouble()
    val c2 = scanner.nextDouble()
    println("Введите коэффициенты третьей прямой:")
    val a3 = scanner.nextDouble()
    val b3 = scanner.nextDouble()
    val c3 = scanner.nextDouble()

    val dir = checkDirect(a1, b1, c1, a2, b2, c2, a3, b3, c3)
    if (dir == 0.0) {
        println("Три прямые пересекаются в одной точке")
    } else {
        println("Три прямые не пересекаются в одной точке")
    }
}
fun checkDirect(a1:Double,b1:Double,c1:Double,a2:Double,b2:Double,c2:Double,a3:Double,b3:Double,c3:Double):Double {
    val dir = (a1 * b2 * c3 + b1 * c2 * a3 + c1 * a2 * b3 - c1 * b2 * a3 - a1 * c2 * b3 - b1 * a2 * c3)
    return dir
}
//ооочень много параметров, как сделать лучше?

//Тестовые данные
//Введите коэффициенты первой прямой:
//2
//3
//1
//Введите коэффициенты второй прямой:
//-2
//5
//0
//Введите коэффициенты третьей прямой:
//-8
//28
//1
//Три прямые пересекаются в одной точке