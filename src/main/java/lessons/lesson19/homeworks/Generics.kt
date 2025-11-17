package lessons.lesson19.homeworks

// 1
fun <M> getMiddleElement(list: List<M>): M? {
    if (list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}


// 5
fun <I, D> transposition(map: Map<I, D>): Map<D, I> {
    return map.map { it }.associate { it.value to it.key }
}





