package lessons.lesson16.homeworks.Two

class Square(private val side: Int) : Shape() {

    override fun area() {
        val area = side * side
        println(area)
    }
}