package lessons.lesson14.homeworks

class Emotion (
    private val type: String,
    private val intensity: Int
) {
    fun express(){
        if (type == "Грусть" && intensity >= 80) {
            println("У меня депрессия")
        } else if (type == "Счастье" && intensity >= 80) {
            println("Я схожу с ума от счастья")
        } else if (type == "Грусть") {
            println("Настроение не очень, надо покушать чипсов и запить гориллой - все пройдет")
        } else if (type == "Счастье") {
            println("Все четко")
        } else println("Неопознанная эмоция")
    }
}