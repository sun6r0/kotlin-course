package lessons.lesson21.homeworks

//Задача 1

fun analyzeDataType(arg: Any) {
    val result = when (arg) {
        is String -> "Это строка: $arg"
        is Number -> "Это число: $arg"
        is List<*> -> "Это список, количество элементов: ${arg.size}"
        is Map<*, *> -> "Это словарь, количество пар: ${arg.size}"
        else -> "Неизвестный тип данных"
    }
    println(result)
}
//Задача 2

fun safeCastToList(arg: Any): Int {
    return (arg as? List<*>)?.size ?: -1
}
//Задача 3

fun getStringLengthOrZero(arg: Any?): Int {
    return (arg as? String)?.length ?: 0
}
//Задача 4

fun Any.toSquare(): Double {
    val number = (this as? Number)?.toDouble()
        ?: (this as String).toDouble()
    return number * number
}
//Задача 5

fun sumIntOrDoubleValues(list: List<Any>): Double {
    return list.sumOf { (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0 }
}
//Задача 6

fun tryCastToListAndPrint(arg: Any) {
    val result = (arg as? List<*>)?.map { (it as? String) ?: "Элемент не является строкой" }
        ?: "Не удалось преобразовать аргумент в список"
    println(result)
}