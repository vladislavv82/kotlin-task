import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите коэффициенты первой прямой:")
    val a1 = scanner.nextDouble()
    val b1 = scanner.nextDouble()
    val c1 = scanner.nextDouble()
    val triple1 = Triple(a1,b1,c1)
    println("Введите коэффициенты второй прямой:")
    val a2 = scanner.nextDouble()
    val b2 = scanner.nextDouble()
    val c2 = scanner.nextDouble()
    val triple2 = Triple(a2,b2,c2)
    println("Введите коэффициенты третьей прямой:")
    val a3 = scanner.nextDouble()
    val b3 = scanner.nextDouble()
    val c3 = scanner.nextDouble()
    val triple3 = Triple(a3,b3,c3)

    val dir = checkDirect(triple1,triple2, triple3)
    if (dir == 0.0) {
        println("Три прямые пересекаются в одной точке")
    } else {
        println("Три прямые не пересекаются в одной точке")
    }
}
fun checkDirect(triple1:Triple<Double,Double,Double>,triple2:Triple<Double,Double,Double>,triple3:Triple<Double,Double,Double>):Double {
    val (a1, b1, c1) = triple1
    val (a2,b2, c2) = triple2
    val (a3,b3,c3) = triple3
    val dir = (a1 * b2 * c3 + b1 * c2 * a3 + c1 * a2 * b3 - c1 * b2 * a3 - a1 * c2 * b3 - b1 * a2 * c3)
    return dir
}
//ооочень много параметров, как сделать лучше?
// ---fix---
//Передаем значения как Triple, далее раскрываем в функции

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
