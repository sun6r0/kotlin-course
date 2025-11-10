package lessons.lesson18.homeworks

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class HouseholdAppliance(
    private var currentTemp: Int
) : TemperatureRegulatable, Openable, ProgrammableDevice() {
    override fun close() {
        isOpened = false
        openStateChange()
    }

    override var maxTemperature = 100

    override fun setTemperature(temp: Int) {
        if (temp < maxTemperature) {
            currentTemp = temp
        }
    }

    override fun open() {
        isOpened = true
        openStateChange()
    }

    private var isOpened: Boolean = false

    private fun openStateChange() {
        val state = if (isOpened) {
            "открыто"
        } else {
            "закрыто"
        }
        println("Устройство $state.")
    }

}