package lessons.lesson15.homeworks.figures

//Класс треугольник
class Triangle(
    color: String = "Green",
    numberOfAngles: Int) : Multiangle(3, color) {

    fun getNumberOfAngles() {
        println(numberOfAngles)
    }
}
