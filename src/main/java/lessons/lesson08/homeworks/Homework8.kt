package lessons.lesson08.homeworks

fun main() {
    println(addDetails("работаю"))

    logParser("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println(maskingBankCard("4539 1488 0343 6467"))

    println(emailFormatting("username@example.com"))

    println(extractFilePath("D:/good.themes/dracula.theme"))

    println(createAbbreviation("Котлин лучший язык программирования"))
}

//    1. Преобразование строк
//    Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным.
//    Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
fun addDetails(arg: String): String {
    val replacedString: String
    val words = arg.split(" ")
    if (arg.contains("невозможно")) {
        replacedString = arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        return replacedString
    } else if (arg.startsWith("Я не уверен")) {
        return "$arg, но моя интуиция говорит об обратном"
    } else if (arg.contains("катастрофа")) {
        replacedString = arg.replace("катастрофа", "интересное событие")
        return replacedString
    } else if (words.size == 1) {
        return "Иногда, ${arg.lowercase()}, но не всегда"
    }
    return arg
}

//    2. Извлечение даты из строки лога
//    У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми, но формат всегда такой).
//    Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй indexOf или split для получения правой части сообщения.
//

fun logParser(arg: String) {
    val words = arg.split(" -> ")
    val dateTime = words[1].split(" ")
    println(dateTime[0])
    println(dateTime[1])
}

//    3. Маскирование личных данных
//    Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".

fun maskingBankCard(arg: String): String {
    val cardData: String = arg.substring(0, 15) + "****"
    return cardData
}

//    4. Форматирование адреса электронной почты.
//    У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()

fun emailFormatting(arg: String): String {
    val emailWithAt: String = arg.replace("@", " [at] ")
    return emailWithAt.replace(".", " [dot] ")
}

//    5. Извлечение имени файла из пути.
//    Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым). Извлеките название файла с расширением.

fun extractFilePath(arg: String): String {
    val pathTokens = arg.split("/")
    return pathTokens.last()
}

//    6. Создание аббревиатуры из фразы.
//    У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
//    Создайте аббревиатуру из начальных букв слов (например, "ООП").
//    Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.

fun createAbbreviation(arg: String): String {
    var firstLetters = ""
    val words = arg.split(" ")
    for (word in words) {
        firstLetters += word[0].toString()
    }
    return firstLetters.uppercase()
}
