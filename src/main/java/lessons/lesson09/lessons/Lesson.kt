package lessons.lesson09.lessons

fun main() {

    //Массивы - упорядоченная коллекция одного размера с элементами одного типа. Им сразу нужно знать размер массива.
    // Они высокопроизводительные и изменяемые. Юзаем когда нужно работать с большим объемом примитивных данных

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4)
    val doubles: DoubleArray  = doubleArrayOf(1.1, 1.2, 1.3)

    val emptyArray = Array(3) { "" } //при создании массива JVM создаст массив из 3 ячеек и 3 раза будет обращаться к блоку кода в скобках фигурных и результат этого кода записывать в ячейки

    val emptyNullableArray1 = arrayOfNulls<Int>(5)
    val emptyNullableArray2 = Array<Int?>(5) { null }


    //Списки. В ниж можно добавлять новые элементы. Юзаем когда нужна гибкость размера. Или когда нужна иммутабельность

    //Неизменяемый (тут значения внутри нельзя менять). Если объявим как var все равно будет неизменяемый список, но зато можно присвоить этой переменной другой список
    val readOnlyList: List<String> = listOf("a", "b")
    //Изменяемый
    val mutableList: MutableList<String> = mutableListOf("a", "b", "d")
    mutableList.add("c")
    mutableList.removeAt(0)
    mutableList[0] = "e"
    mutableList.remove("d")
    mutableList.add(1, "x")
    println(mutableList)

    numbers[0] = 10

    //Множество. Только уникальные значения. Нет возможности получать элементы по индексу. Когда нужно избавиться от дубликатов
    //Работает быстрее List. Оптимизирован для поиска.
    //Для математических операций объединение, пересечение и разность множеств
    val numbersSet: Set<Int> = setOf(1,2,3,4,5)
    val mutableNumberSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    val emptySet: Set<Int> = emptySet()

    mutableNumberSet.add(6)
    mutableNumberSet.remove(1)

    //Избавляемся от дубликатов
    val mutableDuplicateList = mutableListOf("a", "a", "c", "h", "c", "f")
    val setOfUnique = mutableDuplicateList.toSet()
    println(setOfUnique)

    //Способы перебора данных
    val stringsSet = setOf("j", "d", "f", "g", "t", "w", "w")
    for (letter in stringsSet) {
        println("| $letter |")
    }

    //Перебор через индексы
    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }
}