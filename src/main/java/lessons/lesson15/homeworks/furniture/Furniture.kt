package lessons.lesson15.homeworks.furniture

open class Furniture(
    val numberOfLegs: Int,
    val material: String
) {

    fun getFurnitureInfo() {
        println("Мебель с кол-вом опор $numberOfLegs сделана из $material")
    }
}