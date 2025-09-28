package lessons.lesson07.homeworks

fun main() {

//    Прямой диапазон
//   1 Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        print(" $i")
    }
    println()

//  2  Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 2..10 step 2) {
        print(" $i")

    }
    println()


//    Обратный диапазон
//  3  Создайте цикл for, который выводит числа от 5 до 1.

    for (i in 5 downTo 1) {
        print(" $i")
    }
    println()


//  4  Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1 step 2) {
        print(" $i")
    }
    println()


//    С шагом (step)
//  5  Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        print(" $i")
    }
    println()

    //  6  Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3) {
        print(" $i")
    }
    println()

//    Использование до (until)
//  7  Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 12
    for (i in 3 until size step 2) {
        print(" $i")
    }
    println()

//    Задания для цикла while
//    Цикл while
//   8 Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var counter = 0
    while (counter++ < 5) {
        print(" " + counter * counter)
    }
    println()

//   9 Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var number = 10
    while (number >= 5) {
        print(" $number")
        number--
    }
    println()

//    Цикл do while
//  10  Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var c = 5
    do {
        print(" $c")
        c--
    } while (c >= 1)
    println()

//  11  Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var b = 5
    do {
        print(" $b")
        b++
    } while (b < 10)
    println()

//    Задания для прерывания и пропуска итерации
//    Использование break
//  12  Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        print(" $i")
    }
    println()

//  13  Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var n = 1
    while (n >= 1) {
        print(" $n")
        n++
        if (n == 10) break
    }
    println()

//    Использование continue
//  14  В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        print(" $i")
    }
    println()

//  15  Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3
    var x = 1
    while (x <= 10) {
        if (x % 3 == 0) {
            x++
            continue
        }
        print(" $x")
        x++
    }
    println()
}












