package lessons.lesson15.homeworks.education

open class School(
    private val classesList: List<String> = mutableListOf("1А", "2Б", "2В", "9В")
) : EducationBuilding(100, "Гимназия 4")

{
    fun getNumberOfClasses() {
        println(classesList.size)
    }
}