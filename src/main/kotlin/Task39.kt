import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()

    if (N in 10..99) { //если число двухзначное то вызываем calcSum
        val sum = calcSum(N)
        println("\nЧисло является двузначным, сумма цифр числа: $sum")
    } else if (N in 100..999) { // если трехзначное то calcProduct
        val product = calcProduct(N)
        println("\nЧисло является трехзначным, произведение ненулевых цифр числа: $product")
    }
}

fun calcSum(number: Int): Int {
    var sum = 0
    var n = number
    while (n > 0) { //выполняется пока число не станет равным 0
        sum += n % 10  // извлекаем последнии цифры и суммируем с sum
        n /= 10 // уменьшаем число
    }
    return sum //запоминаем
}

fun calcProduct(number: Int): Int {
    var product = 1
    var n = number
    while (n > 0) { //выполняется пока число не станет равным 0
        val digit = n % 10 // извлекаем последнии цифры
        if (digit != 0) {
            product *= digit
        }
        n /= 10 //уменьшаем число если оно не равно 0
    }
    return product
}