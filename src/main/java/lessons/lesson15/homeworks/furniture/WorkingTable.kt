package lessons.lesson15.homeworks.furniture

class WorkingTable(
    width: Int,
    height: Int,
    length: Int,
    val drawerCount: Int,
    val isWheelPresent: Boolean
) : Table(height, length, width)

{
    fun getTableInfo() {
        super.getSizeInfo()
        println("Кол-во ящиков - $drawerCount")
        if (isWheelPresent) println("Стол на колесиках")
    }
}