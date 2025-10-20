package lessons.lesson13

fun main() {

//    Создание и Инициализация
    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)
//    Работа с Map.Entry в Kotlin
//    В Kotlin каждая пара ключ-значение в словаре представлена объектом Map.Entry. Этот объект хранит ключ и значение как свойства key и value соответственно. Работа с Map.Entry позволяет нам получить доступ к ключу и значению каждой пары в словаре.
//
//    Доступ к Элементам Словаря через Map.Entry
//    Когда вы итерируете словарь, каждый элемент, с которым вы работаете в цикле, является объектом Map.Entry. Вот как можно получить доступ к ключам и значениям:
//
//
//
    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    //Альтернативно, можно использовать деструктуризацию для получения ключа и значения напрямую:

    for ((key, value) in fruitsPrices) {
        println("Key: $key, Value: $value")
    }
//    Почему мы изучали Pair а не Map.Entry?
//    Дело в том, что класс Pair не является частью класса Map а используется как контейнер для удобной инициализации начальных значений. На этом его функция завершается, дальше Pair может быть в Map только в качестве данных, например в качестве ключа или значения.
//
//    Map.Entry в свою очередь является составляющей класса Map. Стандартная библиотека не позволяет создавать объект Map.Entry отдельно (но для особо настырных, можно использовать анонимные объекты).
//
//    В дальнейшей работе со словарём Kotlin предлагает нам методы для работы как отдельно с ключами или значениями, так и для работы с Map.Entry который является по сути контейнером для ключа и значения.


//    Получение Элементов
//    entries, keys, values
    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values
    println(entries)
    println(keys)
    println(values)

//    getOrElse, getValue, getOrDefault

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 9999.99 }
    val priceOfApple = fruitsPrices.getValue("apple")
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

//    Изменение состава словаря
    val fruitsWithoutBanana = fruitsPrices - "banana" // создание нового словаря в котором нет "banana"
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // создание нового словаря с дополнительной парой
    val mutableFruits = fruitsPrices.toMutableMap() // Создание нового изменяемого словаря с теми же значениями
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // Добавление словаря
    mutableFruits + mapOf("lime" to 1.1, "avocado" to 1.9) // Не добавляет данные в существующий словарь а создаёт новый, в который включены данные из обоих словарей
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // Очистка словаря

//    Проверка наличия элементов
//    containsKey, containsValue, isEmpty, isNotEmpty

    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }

//    Фильтрация и преобразование
//    filter, filterKeys, filterValues, filterNot, count
    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

//    map, mapKeys, mapValues
    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

//    Преобразование в Map и MutableMap
//    val toMap = mutableFruitsPrices.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()

//    Эти примеры демонстрируют основные методы работы со словарями в Kotlin, начиная от создания и получения элементов до фильтрации, преобразования и работы с изменяемыми словарями. Создание переменных для хранения результатов делает код более читаемым и позволяет легко увидеть результаты выполнения каждого метода.
//
//    Итерация с forEach
//    С использованием деструктуризации

    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
//    С использованием it как объекта Map.Entry

    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }
//    Размер словаря
//    size и count
    fruitsPrices.size // количество ключей
    fruitsPrices.count() // тоже количество ключей
    fruitsPrices.count { it.value > 2 } // количество ключей если сначала применить фильтрацию по условию
}