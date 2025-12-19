package lessons.gson

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

fun main() {

    data class Address(
        val street: String,
        val city: String,
        val postalCode: Int
    )
    data class User(
        val id: Int,
        val name: String,
        val isActive: Boolean,
        val address: Address
    )

    val address = Address("Baker Street", "London", 221)
    val user = User(1, "Sherlock Holmes", true, address)
    val gson = Gson() // Создаём экземпляр Gson
    val json = gson.toJson(user) // Сериализация объекта
    println("JSON: $json")

    val jsonDes = """{"id":1,"name":"Sherlock Holmes","isActive":true,"address":{"street":"Baker Street","city":"London","postalCode":221}}"""
    val gsonDes = Gson()
    val userDes = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
    println("User: $user")

    data class UserWithAlias(
        @SerializedName("user_id") val id: Int,
        @SerializedName("full_name") val name: String,
        val isActive: Boolean
    )

    val jsonSer = """{"user_id":2,"full_name":"John Watson","isActive":false}"""
    val gsonSer = Gson()
    val userSer = gson.fromJson(json, UserWithAlias::class.java)
    println("User with alias: $user")

    val gsonB = GsonBuilder()
        .setPrettyPrinting() // Для красивого форматирования JSON
        .serializeNulls() // Включить null-поля в JSON
        .create()
    val userB = User(3, "Mary Morstan", false, Address("Fleet Street", "London", 123))
    val jsonB = gson.toJson(user)
    println("Pretty JSON:\n$json")
}