package lessons.lesson16.homeworks.Two

class Circle(private val radius: Int) : Shape() {

    override fun area() {
        val area = radius * radius * 3.14
        println(area)
    }
}