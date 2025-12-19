package lessons.files

import java.io.File

//Работа с файлами
//Создание объекта File
//Для начала работы с файловой системой нужно создать объект класса File, передав в конструктор путь к файлу или директории:



fun main() {

    val file = File("path/to/your/file.txt")
    val directory = File("path/to/your/directory")

    //Проверка существования файла или директории
    //Перед выполнением операций с файлом полезно проверить его существование:
    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

    //Создание нового файла
    //Чтобы создать новый файл, используйте метод createNewFile(). Этот метод вернёт true, если файл был успешно создан, и false, если файл уже существует:

    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated) {
        println("Файл был создан")
    } else {
        println("Файл уже существует")
    }

//    Обратите внимание: если путь к файлу включает несуществующие директории, createNewFile() выбросит исключение. Убедитесь, что все родительские директории существуют.
//    Для решения этой проблемы можно перманентно использовать следующий сниппет:
    file.parentFile.mkdirs()
    file.createNewFile()


//    Чтение и запись файла
//    Для записи текста в файл можно использовать метод writeText:

    file.writeText("Hello, world!")
//    Чтение всего текста из файла:
    val text = file.readText()
    println(text)

//    Работа с директориями
//    Создание директории:
    val isDirectoryCreated: Boolean = directory.mkdir()
    if (isDirectoryCreated) {
        println("Директория была создана")
    } else {
        println("Не удалось создать директорию")
    }

//    Получение списка файлов в директории:
    val files = directory.listFiles()
    files?.forEach { file ->
        println(file.name)
    }

//    Удаление файла или директории
    if (file.delete()) {
        println("Файл удален")
    } else {
        println("Не удалось удалить файл")
    }

//    Удаление директории возможно только, если она пуста. Для удаления непустой директории со всеми файлами и поддиректориями можно использовать следующий метод:

    if (file.deleteRecursively()) {
        println("Директория и всё её содержимое удалено")
    } else {
        println("Не удалось удалить директорию")
    }

//    Поиск файлов и директорий
//    Для рекурсивного перебора директорий и файлов применяется метод walk()
//    который предоставляет последовательность sequence которую можно фильтровать и преобразовывать так, как это нужно.

    fun searchFilesUsingWalk(startDir: String, query: String): List<String> {
        return File(startDir)
            .walk() // Рекурсивный обход файлов и директорий начиная с startDir
            .filter { it.isFile && it.name.contains(query, ignoreCase = true) } // Фильтрация по имени файла
            .map { it.absolutePath } // Преобразование результатов в абсолютные пути
            .toList() // Сбор результатов в список
    }

//    Дополнительные методы для работы с файлами в Kotlin
//            absoluteFile
//    Возвращает абсолютный путь к файлу в виде объекта File.
//    Пример:

    val file22 = File("path/to/file.txt")
    println(file22.absoluteFile) // Вывод: /absolute/path/to/file.txt

//    isFile
//    Проверяет, является ли объект файлом.

//    Пример:

    val file33 = File("path/to/file.txt")
    println(file33.isFile) // Вывод: true, если объект - файл
//    name
//    Возвращает имя файла или директории.

//    Пример:

    val file44 = File("/path/to/file.txt")
    println(file44.name) // Вывод: file.txt
//    parent
//    Возвращает строку с путем к родительской директории.

//    Пример:

    val file55 = File("/path/to/file.txt")
    println(file55.parent) // Вывод: /path/to
//    parentFile
//    Возвращает объект File, указывающий на родительскую директорию.

//    Пример:

    val file66 = File("/path/to/file.txt")
    println(file66.parentFile) // Вывод: объект File для /path/to
//    copyTo
//    Копирует файл в указанное местоположение.

//    Пример:

    val sourceFile = File("/path/to/source.txt")
    val destinationFile = File("/path/to/destination.txt")
    sourceFile.copyTo(destinationFile, overwrite = true) // Копирует файл, перезаписывая его при необходимости
//    toRelativeString
//    Возвращает относительный путь от одного File к другому.
//
//    Пример:

    val baseDir = File("/path/to")
    val file77 = File("/path/to/nested/file.txt")
    println(file77.toRelativeString(baseDir)) // Вывод: nested/file.txt
//    walk
//    Выполняет рекурсивный перебор всех файлов директории, предоставляя их как поток, с которым можно работать как с обычными списками

    val file88 = File("path/to/file")
    file88.walk().filter { it.isFile }
        .associate { it.name to it.readLines() }
        .filterValues { data ->
            data.any {it.contains("text")}
        }
}




















