package lessons.lesson19.homeworks

// 6
interface Validator<T> {
    fun validate(element: T): Boolean
}