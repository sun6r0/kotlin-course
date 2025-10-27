package lessons.lesson14.homeworks

class Party (
    private val location: String,
    private val attendees: Int
) {
    fun details() {
        println("Место проведения вечеринки - $location, численность - $attendees")
    }
}