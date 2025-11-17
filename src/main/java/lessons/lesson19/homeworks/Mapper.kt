package lessons.lesson19.homeworks

// 3
interface Mapper<T, R> {
    fun map(element: T): R
    fun map(elements: List<T>): List<R>
}