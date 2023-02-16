import java.util.Scanner

fun isOrdered(n: Int): Boolean {
    var d = n % 10
    var p: Int
    var down = true
    var temp = n / 10

    while (temp != 0) { //пока не будет = 0
        p = d //перелаживаем, тк уже один раз поделили число
        d = temp % 10  //в d записываем число после запятой от деления на 10
        temp /= 10 //уменьшаем число
        if (p < d) { //если число после первого деления минеше чем от последнего деления
            down = false // то ложно и число
            break
        }
    }
    return down
}

fun main() {
    val sc = Scanner(System.`in`)
    print("Введите n: ")
    val n = sc.nextInt()

    if (isOrdered(n)) {
        println("Упорядочено")
    } else {
        println("Не упорядочено")
    }
}