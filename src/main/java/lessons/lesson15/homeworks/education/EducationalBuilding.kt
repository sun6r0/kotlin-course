package lessons.lesson15.homeworks.education

//Класс Учебное заведение
open class EducationBuilding(
    val capacity: Int = 100,
    val title: String
) {

    fun getCapacity() {
        println(capacity)
    }
}