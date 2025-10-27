package lessons.lesson14.homeworks

class Concert (
    private val group: String = "RHCP",
    private val location: String = "Подвал",
    private val cost: Int = 5000,
    private val numberOfSeats: Int = 1000,
    private var soldTickets: Int = 0
) {
    fun concertDetails() {
        println("Место проведения концерта - $location, группа - $group," +
                " стоимость билета - $cost, кол-во мест $numberOfSeats, проданные билеты - $soldTickets")
    }

    fun buyTicket() {
        soldTickets += 1
    }
}