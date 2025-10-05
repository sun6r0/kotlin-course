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


//Работа со списками List

// 1 Создайте пустой неизменяемый список целых чисел.
    val emptyList: List<Int> = emptyList()

    // 2 Создайте неизменяемый список строк, содержащий три элемента
    val stringList = listOf("Hello", "World", "Kotlin")

    // 3 Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5
    val mutableIntList = mutableListOf(1, 2, 3, 4, 5)

    // 4 Имея изменяемый список целых чисел, добавьте в него новые элементы
    val mutableIntList4 = mutableListOf(1, 2, 3, 4, 5)
    mutableIntList4.add(6)
    mutableIntList4.add(7)
    mutableIntList4.add(8)
    println("После добавления элементов: $mutableIntList4")

    // 5 Имея изменяемый список строк, удалите из него определенный элемент
    val mutableStringList = mutableListOf("Hello", "World", "Kotlin")
    mutableStringList.remove("World")
    println("После удаления 'World': $mutableStringList")

    // 6 Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран
    val numbers = listOf(10, 20, 30, 40, 50)
    for (number in numbers) {
        println("$number ")
    }

    // 7 Создайте список строк и получите из него второй элемент, используя его индекс
    val l7 = listOf("avav", "asas", "awawa", "aqqqaqa")
    val secondElement = l7[1]

    // 8 Имея изменяемый список чисел, измените значение элемента на определенной позиции
    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)
    mutableNumbers[2] = 100
    println("После изменения элемента с индексом 2: $mutableNumbers")

    // 9 Создайте два списка строк и объедините их в один новый список с помощью циклов
    val list1 = listOf("Apple", "Banana")
    val list2 = listOf("Orange", "Grape")
    val combinedList = mutableListOf<String>()

    for (item in list1) {
        combinedList.add(item)
    }

    for (item in list2) {
        combinedList.add(item)
    }
    println("Объединенный список: $combinedList")

    // 10 Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл
    val numbersList = listOf(34, 12, 89, 5, 67, 23)
    var min = numbersList[0]
    var max = numbersList[0]

    for (number in numbersList) {
        if (number < min) min = number
        if (number > max) max = number
    }
    println("Минимальный: $min, Максимальный: $max")

    // 11 Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка
    val originalList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = mutableListOf<Int>()

    for (number in originalList) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    println("Четные числа: $evenNumbers")

    //Работа с множествами

    // 1 Создайте пустое неизменяемое множество целых чисел
    val emptySet: Set<Int> = emptySet()

    // 2 Создайте неизменяемое множество целых чисел, содержащее три различных элемента
    val numberSet = setOf(1, 2, 3)

    // 3 Создайте изменяемое множество строк и инициализируйте его несколькими значениями
    val mutableStringSet = mutableSetOf("Kotlin", "Java", "Scala")

    // 4 Имея изменяемое множество строк, добавьте в него новые элементы
    mutableStringSet.add("Swift")
    mutableStringSet.add("Go")
    println("После добавления элементов: $mutableStringSet")

    // 5 Имея изменяемое множество целых чисел, удалите из него определенный элемент
    val mutableNumberSet = mutableSetOf(1, 2, 3, 4, 5)
    mutableNumberSet.remove(2)
    println("После удаления элемента 2: $mutableNumberSet")

    // 6 Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран
    val integerSet = setOf(10, 20, 30, 40, 50)
    for (number in integerSet) {
        print("$number ")
    }
    println()

    // 7 Функция, которая проверяет, есть ли в множестве указанная строка
    val programmingLanguages = setOf("Kotlin", "Java", "Python", "JavaScript")

    fun containsElement(set: Set<String>, element: String): Boolean {
        for (item in set) {
            if (item == element) {
                return true
            }
        }
        return false
    }

    println("'Kotlin' в множестве: ${containsElement(programmingLanguages, "Kotlin")}")
    println("'C++' в множестве: ${containsElement(programmingLanguages, "C++")}")

    // 8 Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла
    val stringSetS8 = setOf("Apple", "Banana", "Orange", "Apple") // Дубликаты будут удалены
    val stringListS8 = mutableListOf<String>()

    for (item in stringSetS8) {
        stringListS8.add(item)
    }
}
