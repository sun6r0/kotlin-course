package lessons.lesson12.homeworks

fun main() {
    println("Hello World!")

    val numbers = listOf(-1, 2, -3, 4, -5, 8, 15, 19, 21, 264)


    //Задачи на приведение коллекции к значению
    //1. Проверить, что размер коллекции больше 5 элементов
    val first = numbers.size > 5
    println(first)
    //2. Проверить, что коллекция пустая
    val sec = numbers.isEmpty()
    println(sec)
    //3. Проверить, что коллекция не пустая
    val third = numbers.isNotEmpty()
    println(third)
    //4. Взять элемент по индексу или создать значение если индекса не существует
    val four = numbers.getOrElse(11) { 10 }
    println(four)
    //5. Собрать коллекцию в строку
    val five = numbers.joinToString(" * ")
    println(five)
    //6. Посчитать сумму всех значений
    val six = numbers.sum()
    println(six)
    //7. Посчитать среднее
    val seven = numbers.average()
    println(seven)
    //8. Взять максимальное число
    val eight = numbers.max()
    println(eight)
    //9. Взять минимальное число
    val nine = numbers.min()
    println(nine)
    //10. Взять первое число или null
    val ten = numbers.firstOrNull()
    println(ten)
    //11. Проверить, что коллекция содержит элемент
    val eleven = numbers.contains(5)
    println(eleven)

    //Задачи на обработку коллекций
    //12. Отфильтровать коллекцию по диапазону 18-20
    val twelve = numbers.filter {
        it in 18..20
    }
    println(twelve)
    //13. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val thirteen = numbers.filterNot {
        it % 2 == 0 && it % 3 == 0
    }
    println(thirteen)
    //14. Очистить текстовую коллекцию от null элементов
    val fourteen = numbers.filterNotNull()
    println(fourteen)
    //15. Преобразовать текстовую коллекцию в коллекцию длин слов
    val texts = arrayOf("Кабан", "Мир", "Эйфьятлайокудль", "Австралия", "Австралия", "Колба")
    val textsLength = texts.map { it.length }
    println(textsLength)
    //16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    val mapOfRevertedTexts = texts.associate {
        it.reversed() to it.length
    }
    println(mapOfRevertedTexts)
    //17. Отсортировать список в алфавитном порядке
    val textsSortedByAlphabet = texts.sorted()
    println(textsSortedByAlphabet)
    //18. Взять первые 3 элемента списка
    val getFirst3 = texts.take(3)
    println(getFirst3)
    //19. Распечатать квадраты элементов списка
    numbers.forEach { print(" " + it * it) }
    println()
    //20. Группировать список по первой букве слов
    val groupedByFirstLetter = texts.groupBy { it.first() }
    println(groupedByFirstLetter)
    //21. Очистить список от дублей
    val getRidOfDoubles = texts.distinct()
    println(getRidOfDoubles)
    //22. Отсортировать список по убыванию
    val sortedByDescending = texts.sortedDescending()
    println(sortedByDescending)
    //23. Взять последние 3 элемента списка
    val getLast3 = texts.takeLast(3)
    println(getLast3)

    //Реши задачи ниже в отдельных функциях.
    //24. Характеристика числовой коллекции
    //Напиши функцию, которая принимает коллекцию чисел и возвращает строку
    // с характеристикой коллекции используя конструкцию when
//    Если коллекция пустая - “Пусто”
//    Если количество элементов меньше пяти - “Короткая”
//    Если коллекция начинается с 0 - “Стартовая”
//    Если сумма всех чисел больше 10000 - “Массивная”
//    Если среднее значение равно 10 - “Сбалансированная”
//    Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//    Если максимальное число меньше -10 - “Отрицательная”
//    Если минимальное число больше 1000 - “Положительная”
//    Если содержит одновременно числа 3 и 14 - “Пи***тая”
//    Иначе - “Уникальная”
//    Вызвать метод с данными, подходящими под каждую из веток
    fun twentyFour (i: List<Int> ): String {
        return when{
            i.isEmpty() -> "Пусто"
            i.size < 5 -> "Короткая"
            i.first() == 0 -> "Стартовая"
            i.sum() > 10000 -> "Массивная"
            i.average() == 10.0 -> "Сбалансированная"
            i.max() < -10 -> "Отрицательная"
            i.min() > 1000 -> "Положительная"
            i.joinToString("").length == 20 -> "Клейкая"
            i.contains(3) && i.contains(14) -> "Пи***тая"
            else -> "Уникальная"
        }
    }
    println(twentyFour(listOf()))
    println(twentyFour(listOf(1,2)))
    println(twentyFour(listOf(0,2,3,4,5)))
    println(twentyFour(listOf(3000, 3001, 1000, 2000, 3330)))
    println(twentyFour(listOf(123, 567, 902, 345, 789, 234, 90)))
    println(twentyFour(listOf(8,9,10,11,12)))
    println(twentyFour(listOf(-11,-22,-33, -44, -55)))
    println(twentyFour(listOf(1001, 2000, 3000, 2222, 1111)))
    println(twentyFour(listOf(3,14, 1,2,3,4)))
    println(twentyFour(listOf(50, 50, 0, 0, 0)))

//    Задача 25. Анализ учебных оценок
//    Напиши функцию, которая принимает список чисел и возвращает список чисел.
//
//    Пример данных: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//
//    Цель: Отфильтровать удовлетворительные оценки (>=60),
//    отсортировать оставшиеся по возрастанию и взять первые 3.
//    Вызывай методы обработки и фильтрации последовательно один из другого,
//    чтобы результат предыдущего метода являлся основой для следующего.

    val grades = listOf(85, 58, 60, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    fun twentyFive (i: List<Int> ): List<Int> {
        return i.filter {
            it >= 60
        }.sorted().take(3)
    }
    println(twentyFive(grades))


//    Задача 26. Создание каталога по первой букве
//    Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - списком строк.
    // Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве используя метод groupBy
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    fun twentySix (i: List<String>): Map<Char, List<String>> {
        return i.map { it.lowercase() }.groupBy { it.first() }
    }
    println(twentySix(list))

    //Задание 28: Категоризация чисел
    //Напиши функцию, которая принимает список чисел и возвращает словарь с ключами - строками и значениями - список чисел.
    //
    //Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    //
    //Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
    val numbers2 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    fun twentyEight (i: List<Int>): Map<String, List<Int>> {
        return i.distinct().sortedDescending().groupBy { it ->
            if (it % 2 == 0) "четные" else "нечетные"
        }
    }

    println(twentyEight(numbers2))

//    Задание 29: Поиск первого подходящего элемента
//    Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
//
//    Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60) и число для проверки возраста, например 18.
//
//    Цель: Найти первый возраст в списке, который соответствует условию (больше второго аргумента) и вернуть его, либо null если значения не нашлось.
    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    fun twentyNine (i: List<Int?>, age: Int): Int? {
        return i.firstOrNull { it != null && it > age }
    }

    println(twentyNine(ages, 60))
}

