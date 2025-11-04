package lessons.lesson16.homeworks.Two

class Triangle(private val side: Int,
     private val height: Int) : Shape() {

    override fun area() {
        val area = (side * height)/2
        println(area)
    }
}