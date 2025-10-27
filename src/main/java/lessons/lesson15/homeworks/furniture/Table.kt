package lessons.lesson15.homeworks.furniture

open class Table(
    private val height: Int,
    private val length: Int,
    private val width: Int
) : Furniture(4, "МДФ")

{
    fun getSizeInfo() {
        println("Высота стола $height, длина стола $length, ширина стола $width")
    }
}