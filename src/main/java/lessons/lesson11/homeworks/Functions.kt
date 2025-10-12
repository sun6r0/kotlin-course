package lessons.lesson11.homeworks

//Задачи на сигнатуру метода

// 1 Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение.
public fun exampleFunction(number: Int, text: String): Boolean {
    return number > 0 && text.isNotEmpty()
}
// 2 Не принимает аргументов и не возвращает значения.
public fun noArgsNoReturn() {
    println("Функция без аргументов и возвращаемого значения")
}

// 3 Принимает два целых числа и возвращает их сумму.
public fun sum(a: Int, b: Int): Int {
    return a + b
}

// 4 Принимает строку и ничего не возвращает.
public fun printString(text: String) {
    println(text)
}

// 5 Принимает список целых чисел и возвращает среднее значение типа Double.
public fun calculateAverage(numbers: List<Int>): Double {
    return if (numbers.isEmpty()) 0.0 else numbers.average()
}

// 6 Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun getNullableStringLength(nullableString: String?): Int? {
    return nullableString?.length
}

// 7 Не принимает аргументов и возвращает nullable вещественное число.
public fun getNullableDouble(): Double? {
    return Math.random()
}

// 8 Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun processNullableList(numbers: List<Int>?) {
    numbers?.forEach { println(it) }
}

// 9 Принимает целое число и возвращает nullable строку.
public fun intToNullableString(number: Int): String? {
    return if (number != 0) number.toString() else null
}

// 10 Не принимает аргументов и возвращает список nullable строк.
public fun getNullableStringList(): List<String?> {
    return listOf("text", null, "another text", null)
}

// 11 Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
public fun complexNullableFunction(text: String?, number: Int?): Boolean? {
    return  null
}

//Задачи на написание кода
//Напишите валидную сигнатуру метода а так же рабочий код для задач.

// 1 Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 2 Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 3 Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

// 4 Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

// 5 Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings: List<String?>) {
    for (string in strings) {
        if (string == null) {
            return
        }
        println(string)
    }
}
