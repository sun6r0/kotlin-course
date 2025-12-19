package lessons.gson.pojo

import com.google.gson.annotations.SerializedName

data class University(
    val name: String,
    @SerializedName("established_year") val establishedYear: Int,
    val faculties: List<Faculty>
)