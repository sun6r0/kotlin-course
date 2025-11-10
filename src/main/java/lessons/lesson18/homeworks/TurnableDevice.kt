package lessons.lesson18.homeworks

//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
abstract class TurnableDevice(

    var isPoweredOn: Boolean = false
) : Powerable {

    override fun powerOn() {
        isPoweredOn = true
        onPowerChange()
    }

    override fun powerOff() {
        isPoweredOn = false
        onPowerChange()
    }

    private fun onPowerChange() {
        val state = if (isPoweredOn) {
            "включено"
        } else {
            "выключено"
        }
        println("Устройство '$state.")
    }
}