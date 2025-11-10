package lessons.lesson18.homeworks

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

//Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.
//•	Холодильник
abstract class Refrigerator(
    val brand: String
) : TemperatureRegulatable, Openable, Cleanable
//•	Стиральная машина
abstract class WashingMachine(
    val brand: String
) : Timable, Openable, Drainable, WaterConnection
//•	Умная лампа
abstract class SmartLamp(
    val brand: String
) : Movable, LightEmitting, AutomaticShutdown, Powerable
//•	Электронные часы
abstract class ElectronicalWatch(
    val brand: String
) : Movable, Rechargeable, Programmable, Powerable
//•	Робот-пылесос
abstract class VacuumRobot(
    val brand: String
) : Movable, Rechargeable, Programmable, Cleanable, Powerable
//•	Механические часы
abstract class MechanicalWatch(
    val brand: String
) : Movable, BatteryOperated, Mechanical
//•	Фонарик
abstract class Ligthener(
    val brand: String
) : Movable, BatteryOperated, LightEmitting
//•	Кофемашина
abstract class Cofemachine(
    val brand: String
) : Movable, Cleanable, WaterContainer, Powerable
//•	Умная колонка
abstract class SmartSoundbar(
    val brand: String
) : Movable, SoundEmitting, Powerable

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
//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
abstract class ProgrammableDevice() : Programmable, TurnableDevice() {
    override fun programAction(action: String) {
        println("Действие $action")
    }
    override fun execute() {
        println("Выполнение действия ${programAction("какое-то действие")}")
    }
}
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

//Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса с возможностью устанавливать температуру и открываться. Пусть это будет холодильник, стиральная машина, чайник, духовка. Добавь недостающие интерфейсы и реализуй необходимые методы (достаточно вывод в консоль производимого действия). Обрати внимание на то, что установка температуры и программирование устройства (считай - задание режима работы) не имеет смысла при выключенном питании - добавь эту проверку.
class Refrigeratorr( brand: String,
                     serialNumber: String
) : HouseholdAppliance( 0) {

    override fun open() {
        println("Дверца открыта")
    }

    override fun close() {
        println("Дверца закрыта")
    }
}

class WashingMachinee( brand: String,
                       serialNumber: String
) : HouseholdAppliance( 0) {

    override fun open() {
        println("Дверца открыта")
    }

    override fun close() {
        println("Дверца закрыта")
    }
}

class Pot( brand: String,
           serialNumber: String
) : HouseholdAppliance( 0) {

    override fun open() {
        println("Крышка открыта")
    }

    override fun close() {
        println("Крышка закрыта")
    }
}

class CoffeMachine(brand: String,
                   serialNumber: String, override val capacity: Int
) : HouseholdAppliance( 0), WaterContainer {

    override fun open() {
        println("Крышка для кофе открыта")
    }

    override fun close() {
        println("Крышка для кофе закрыта")
    }

    override fun fillWater(amount: Int) {
        println("Добавлено воды $amount")
    }

    override fun getWater(amount: Int) {
        println("Получено воды $amount")
    }
}


fun main() {

    val cm = CoffeMachine("SMEG", "123213", 100)
    cm.setTemperature(60)
    cm.fillWater(100)

    val r = Refrigeratorr("Haier", "2145")
    r.open()

}