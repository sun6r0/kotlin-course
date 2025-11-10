package lessons.lesson18.homeworks

//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
abstract class ProgrammableDevice() : Programmable, TurnableDevice() {
    override fun programAction(action: String) {
        println("Действие $action")
    }
    override fun execute() {
        println("Выполнение действия ${programAction("какое-то действие")}")
    }
}