import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val y = calculateY(x)
    println("y = $y")
}

fun calculateY(x: Int): Int {
    return when { //типо swith case
        x <= 0 -> 0
        x>0 && x<=1 -> x
        else -> Math.pow(x.toDouble(),2.0).toInt() //???
    }
}

//13.2

//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val x = scanner.nextInt()
//    val y = calculateY(x)
//    println("y = $y")
//}
//
//fun calculateY(x: Int): Int {
//    return when {
//        x > 0 -> Math.log10(x.toDouble()).toInt()
//        x == 0 -> 0
//        else -> Math.pow(x.toDouble(), 2.0).toInt()
//    }
//}
