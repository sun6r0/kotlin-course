package lessons.gson

import com.google.gson.GsonBuilder
import lessons.gson.pojo.Faculty
import lessons.gson.pojo.Gender
import lessons.gson.pojo.Student
import lessons.gson.pojo.University
import java.io.File

fun main() {

    val student1 = Student("John", "Doe", 20, Gender.MALE)
    val student2 = Student("Jane", "Doe", 19, Gender.FEMALE)
    val faculty = Faculty("Engineering", "Dr. Smith", 1965, listOf(student1, student2))
    val university = University("Tech University", 1905, listOf(faculty))

    val gson = GsonBuilder().setPrettyPrinting().create()
    gson.toJson(university).also { File("src/main/resources/university.json").writeText(it) }


    fun jsonToUniversity() {
        val json = File("src/main/resources/university.json").readText()
        val universityDeserialized = gson.fromJson(json, University::class.java)
        universityDeserialized.faculties.forEach { faculty ->
            println("\nФакультет: ${faculty.name}")
        }
        faculty.students.forEach { student ->
            println("${student.firstName} ${student.lastName}, ${student.age} лет, ${student.gender}")
        }
    }

    jsonToUniversity()
}