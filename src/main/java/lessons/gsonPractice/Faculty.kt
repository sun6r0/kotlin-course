package lessons.gsonPractice

import com.google.gson.annotations.SerializedName

data class Faculty (
    val name: String,
    val dean: String,
    @SerializedName("launch_year") val launchYear: Int,
    val student: List<Student>
)