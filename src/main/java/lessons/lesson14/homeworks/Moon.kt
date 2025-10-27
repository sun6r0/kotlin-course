package lessons.lesson14.homeworks

object Moon {
    private var isVisible: Boolean = true
    private var phase: String = "Растущая Луна"

    fun showPhase() {
        if (isVisible) {
            println("Луну видно, фаза луны - $phase")
        } else println("Луну не видно")
    }

    fun showPhase(isVisible: Boolean, phase: String?) {
        if (isVisible) {
            println("Луну видно, фаза луны - $phase")
        } else println("Луну не видно")
    }
}