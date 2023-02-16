import java.util.*

fun gcd(a: Int, b: Int): Int { //
    return if (b == 0) a else gcd(b, a % b)  //если b = 0 то nod будет a иначе ищем нод
}// gcd fun kotlin для того что бы посчитать НОД

fun nok(a: Int, b: Int): Int { //
    return a * b / gcd(a, b)
}

fun main() {
    val sc = Scanner(System.`in`)
    print("Введите первое натуральное число: ")
    val m = sc.nextInt()
    print("Введите второе натуральное число: ")
    val n = sc.nextInt()

    if (m > 0 && n > 0) {
        val result = nok(m, n)
        println("НОК ($m, $n) = $result")
    } else {
        println("Числа m и n не являются натуральными")
    }
}