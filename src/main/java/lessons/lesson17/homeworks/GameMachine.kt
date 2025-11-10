package lessons.lesson17.homeworks


class GameMachine(val color: String,
                  val model: String,
                  val hasGamePad: Boolean) {

    private var isOn: Boolean = false
    private var isOsLoaded: Boolean = false
    var installedGames: List<String> = mutableListOf("Mario", "Space Rangers", "Resident Evil")
    private var balance: Double = 0.0
    private var owner: String = ""
    var servicePhone: String = "1234"
    private var isGameSessionPayed : Boolean = false
    private var sessionCost: Double = 5.0
    private var pin: String = ""

    fun turnOn() {
        isOn = true
        loadOs()
    }
    fun turnOff() {
        shutDownOs()
        isOn = false
    }
    private fun loadOs() {
        println("ОС загружена")
    }
    private fun shutDownOs() {
        println("Работа ОС завершена")
    }
    fun showGames() = installedGames.toList()
    fun play(gameName: String) {
        if (!isGameSessionPayed) {
            println("Оплати игру прежде чем начать")
            return
        }
        if (gameName !in installedGames) {
            println("Игра '$gameName' не найдена")
        } else {
            println("Игра '$gameName' запущена" )
        }
        isGameSessionPayed = false
    }
    fun pay() {
        balance += sessionCost
    }
    fun withdraw(pin: String): Double {
        if (pin != this.pin) {
            return 0.0
        }
        return openSafe()
    }
    private fun openSafe(): Double {
        val withdraw = balance
        balance = 0.0
        return withdraw
    }

}