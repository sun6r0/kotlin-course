package lessons.lesson09.homeworks

fun main() {

//    Работа с массивами Array

//    1 Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val a1: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//    2 Создайте пустой массив строк размером 10 элементов.

    val a2: Array<String> = Array(10) { "" }

//    3 Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val a3 = DoubleArray(5)
    for (index in a3.indices) {
        a3[index] = 2.0 * index
        println(a3[index])
    }

//    4 Создайте массив из 5 элементов типа Int.
//    Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val a4 = arrayOf(1, 2, 3, 4, 5)
    for (index in a4.indices) {
        a4[index] = 3 * index
        println(a4[index])
    }

//    5 Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5: Array<String?> = arrayOf(null, "Hello", "World")

//    6 Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val a6: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val a6Copy: Array<Int> = a6.copyOf()

    for (i in a6Copy) {
        println("| $i |")
    }

//    7 Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
//    Распечатайте полученные значения.

    val a7First: Array<Int> = arrayOf(7, 89, 22, 11, 9)
    val a7Second: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val a7Third: Array<Int> = Array(5) { 0 }
    for (i in a7Third.indices) {
        a7Third[i] = a7First[i] - a7Second[i]
        println(a7Third[i])
    }

//    8 Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1.
//    Реши задачу через цикл while.

    val a8: Array<Int> = arrayOf(7, 89, 22, 6, 5, 9)
    var index = 0
    var found = false

    while (index < a8.size) {
        if (a8[index] == 5) {
            found = true
            break
        }
        index++
    }

    if (found) {
        println("Индекс элемента со значением 5: $index")
    } else {
        println("-1")
    }

//    9 Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//    Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val a9: Array<Int> = arrayOf(7, 89, 22, 6, 5, 9)
    for (a in a9) {
        if (a%2 == 0) println("$a четное") else println("$a нечетное")
    }

//    10 Создай функцию, которая принимает массив строк и строку для поиска.
//    Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//    Распечатай найденный элемент.

    val a10: Array<String> = arrayOf("Онашь", "Нмышьо", "ццуццуцумыжж")
    val stringToFind = "мышь"

    fun findSubstringInArray(arg: Array<String>, stringToFind: String) {
        for (a in arg) {
            if (a.contains(stringToFind)) {
                println(a)
            }
        }
    }

    findSubstringInArray(a10, stringToFind)
}