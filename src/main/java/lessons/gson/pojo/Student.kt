package lessons.gson.pojo

import com.google.gson.annotations.SerializedName

class Student (
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    val age: Int,
    val gender: Gender
)

