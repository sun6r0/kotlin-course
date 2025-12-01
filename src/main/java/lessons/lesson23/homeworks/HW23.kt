package lessons.lesson23.homeworks

fun example01(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.filter { it % 2 == 0 }
        .average()
}

fun example02(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}

fun List<Int>.duplicates(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

fun main() {
    val e1 = fun (list: List<Int>): Double {
        require(list.isNotEmpty())
        return list.filter { it % 2 == 0 }
            .average()
    }
    val e11: (List<Int>) -> Double = { list ->
        require(list.isNotEmpty())
        list.filter { it % 2 == 0 }
            .average()
    }
    val e111 = { list: List<Int> ->
        require(list.isNotEmpty())
        list.filter { it % 2 == 0 }
            .average()
    }
    val list1 = listOf<Int>()
    val list2 = listOf(1)
    val list3 = listOf(1, 2, 3, 4, 5, 6)
    println(e111(list3))

    val e2 = fun (bigNumber: Long): Int {
        require(bigNumber > 0) { "Число должно быть больше нуля" }
        return "$bigNumber".sumOf { it.digitToInt() }
    }
    val e22: (Long) -> Int = { number ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }
    val e222 = { number: Long ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }

    val d1 = fun List<Int>.(): Set<Int> {
        return toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    val d11: List<Int>.() -> Set<Int> = {
        toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    val l = listOf(0, 1, 2, 4, 2, 5, 6, 5, 7)
    println(l.d11())
}