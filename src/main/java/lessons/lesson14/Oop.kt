package lessons.lesson14

fun main() {
    val reservedSeatCarriage = Carriage(48)
    val compartmentCarriage = Carriage(16, "Купе")
    val train = Train("Electric locomotive")
    train.carriages.add(reservedSeatCarriage)
    train.carriages.add(compartmentCarriage)
    val passengerAlexandr = Passenger("Alexandr", "02.10.1983", "")
    train.boardPassenger(passengerAlexandr, 10, "Купе")

    Logger.log("Application started")

    val result = Calculator.add(5, 3)
    println("Result: $result")

}

//Синглтон-объект. Его экземпляр создавать не надо, сразу обращаемся к нему.
//Создавать можно где угодно, доступен отовсюду
//Это удобно, когда вам нужен глобальный объект, например, менеджер конфигурации или логгер.
object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}

//Если вам необходимо создать что-то похожее на статическое поле или метод (как в Java),
// в Kotlin используется companion object. Он позволяет объявить статические методы и переменные,
// которые принадлежат самому классу, а не конкретному его экземпляру:

class Calculator {
    //компаньон всегда принадлежит какому-то классу, сам по себе не объявляется
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}