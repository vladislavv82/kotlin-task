fun checkNumber(number: Int): Boolean {
    return number in 100..999   //если число в этом диапазоне то true
}
fun main() {
    val number = 456
    if (checkNumber(number)) {   // вызываем функцию в параметрах передаём число
        val lastTwoDigits = number % 100  // остаток от деления это и будет два последних числа
        println(lastTwoDigits)
    } else {
        println("Число не является трехзначным")
    }
}
//fun main() {
//    val number = 456
//    if (checkNumber(number)) {
//        val lastTwoDigits = number % 100
//        println(lastTwoDigits)
//    } else if (number < 100) {
//        println("Число меньше 100")
//    } else {
//        println("Число больше 999")
//    }
//}
//
//fun main() {
//    val number = 456
//    val result = if (checkNumber(number)) number % 100 else "Число не является трехзначным"
//    println(result)
//}