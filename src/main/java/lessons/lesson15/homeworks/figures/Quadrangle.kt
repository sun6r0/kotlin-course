package lessons.lesson15.homeworks.figures

//Класс четырехугольник
class Quadrangle (
    color: String = "Green",
    private val sideLength: Int,
    numberOfAngles: Int) : Multiangle(4, color) {

    fun getSquare() {
        println(sideLength*sideLength)
    }
}
