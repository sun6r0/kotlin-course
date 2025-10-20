package lessons.lesson13.homeworks

fun main() {
    //1 Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val first = mapOf("test1" to 2.99, "test2" to 1.99, "test3" to 3.99)
    println(first.values.average())

    //2 Имеется словарь с метаданными автоматизированных тестов,
    // где ключи — это имена тестовых методов, а значения - строка с метаданными. Выведите список всех тестовых методов.
    val second = mapOf("test1" to "METADATA 1", "test2" to "METADATA 2", "test3" to "METADATA 3")
    println(second.keys.toList())

    // 3 В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val third = mutableMapOf("test1" to "FAILED", "test2" to "BLOCKED", "test3" to "PASSED")
    third.put("test4", "PASSED")
    println(third)

    //4 Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val four = mutableMapOf("test1" to "FAILED", "test2" to "SKIPPED", "test3" to "PASSED", "test5" to "PASSED")
    println(four.count{it.value == "PASSED"})

    //5 Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val five = mutableMapOf("BUG-1" to "FIXED", "BUG-2" to "SKIPPED", "BUG-3" to "CLOSED", "BUG-4" to "BLOCKED")
    five.remove("BUG-1", "FIXED")

    //6 Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
    // выведите сообщение о странице и статусе её проверки.
    val six = mapOf("url" to "OK", "url2" to "failed")
    six.forEach {
            (url, status) -> println("Страница $url: статус $status")
    }

    //7 Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val seven = mapOf("service1" to 2.99, "service2" to 1.99, "service3" to 3.99)
    println(seven.filter { it.value > 2.00 })

    //8 В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
    // Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val eight = mapOf("endpoint1" to "OK", "endpoint2" to "BAD_REQUEST")
    println(eight.getOrDefault("endpoint1", "OK"))

    //9 Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение -
    // сама конфигурация), получите значение для "browserType". Ответ не может быть null
    val nine = mapOf("param1" to "config1", "param2" to "config2", "browserType" to "Firefox")
    println(nine.getValue("browserType"))

    //10 Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val ten = mapOf("version1" to "1.0.1", "version2" to "2.0.2")
    val tenCopy = ten + ("V3" to "3.1.1")
    println(tenCopy)

    //11 Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства,
    // значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val eleven = mapOf("iPhone14" to "iOS17", "Samsung" to "Android11")
    eleven.getOrElse("iPhone20") {"default_settings"}

    //12 Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val twelve = mapOf("400" to "BAD_REQ", "500" to "SERVER_ERROR")
    println(twelve.containsKey("400"))

    //13 Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    // а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов,
    // то-есть в ключе содержится требуемая версия.
    val thirteen = mapOf("TestID_Version" to "Passed", "12321_1.0" to "Failed", "PSP-123_77.92" to "Skipped")
    val res = thirteen.filterKeys { it.contains("77.92") }
    println(res)

    //14 У вас есть словарь, где ключи — это названия функциональных модулей приложения,
    // а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val fourteen = mapOf("calc" to "passed - 100", "save" to "failed - 51, passed - 10", "retrieve" to "failed - 5, passed - 70")
    val res14 = fourteen.filterValues { it.contains("failed") }
    println(res14)

    //15 Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val testEnv = mutableMapOf("browser" to "chrome", "timeout" to 40)
    val additionalEnv = mapOf("headless" to true, "screenshots" to false)
    testEnv.putAll(additionalEnv)

    //16 Объедините два неизменяемых словаря с данными о багах.
    val bugs1 = mapOf("bug1" to "critical", "bug2" to "minor")
    val bugs2 = mapOf("bug3" to "major", "bug4" to "trivial")
    val allBugs = bugs1 + bugs2
    println(allBugs)

    //17 Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val tempRunData = mutableMapOf("startTime" to "10:00", "endTime" to "10:30", "duration" to "30min")
    tempRunData.clear()

    //18 Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val testReport = mapOf("test1" to "passed", "test2" to "skipped", "test3" to "failed")
    val filteredReport = testReport.filterNot { it.value == "skipped" }
    println(filteredReport)

    //19 Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val testConfigs = mapOf("browser" to "chrome", "timeout" to 30, "screenshots" to true)
    val reducedConfigs = testConfigs - "screenshots"
    println(reducedConfigs)

    //20 Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResults2 = mapOf("T001" to "PASS", "T002" to "FAIL", "T003" to "PASS")
    val report = testResults2.map { (testId, result) -> "Test $testId: $result" }

    //21 Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val lastRunResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    val archivedResults = lastRunResults.toMap()

    //22 Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val testPerformance = mapOf(1 to 12.5, 2 to 8.0, 3 to 15.3)
    val stringKeyed = testPerformance.mapKeys { it.key.toString() }

    //23 Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val performanceScores = mapOf("v1.0" to 1.5, "v1.1" to 1.2, "v2.0" to 0.8)
    val adjustedScores = performanceScores.mapValues { it.value * 1.1 }

    //24 Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compileErrors = emptyMap<String, String>()
    val isEmpty = compileErrors.isEmpty()

    //25 Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTestResults = mapOf("users_100" to "success", "users_500" to "timeout")
    val isNotEmpty = loadTestResults.isNotEmpty()

    //26 Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val automationResults = mapOf("test1" to true, "test2" to true, "test3" to true)
    val allPassed = automationResults.all { it.value }

    //27 Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val testResults = mapOf("test1" to "passed", "test2" to "error", "test3" to "passed")
    val hasErrors = testResults.any { it.value == "error" }

    //28 Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val serviceTests = mapOf(
        "login_optional" to "failed",
        "payment" to "passed",
        "logout_optional" to "failed",
        "auth_optional" to "passed"
    )
    val failedOptional = serviceTests.filter {
        it.key.contains("optional") && it.value == "failed"
    }
}