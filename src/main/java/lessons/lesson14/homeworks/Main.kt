package org.example

import lessons.lesson14.homeworks.*

fun main() {

    val party = Party("Клуб", 50)
    party.details()
    println()

    val emotion = Emotion("Грусть", 90)
    emotion.express()
    val emotion2 = Emotion("Грусть", 20)
    emotion2.express()
    println()

    Moon.showPhase()
    Moon.showPhase(true, "Полнолуние")
    Moon.showPhase(false, null)
    println()

    val product1 = Product("Арбуз", 299.99, 2)
    val product2 = Product("Картошка", 30.0, 10)
    val product3 = product1.copy(count = 1)
    val product4 = product3.copy()
    println("product1 - $product1")
    println("product2 - $product2")
    println("product3 - $product3")
    println("product4 - $product4")
    println(product3 == product1)
    println(product3 == product4)

    val concert = Concert()
    println(concert.concertDetails())
    concert.buyTicket()
    println(concert.concertDetails())

    val shelf = Shelf(40)
    shelf.addItem("Гордость и предубеждение")
    shelf.addItem("Преступление и наказание")
    shelf.addItem("Властелин колец")
    shelf.addItem("Энциклопедия динозавров")
    println(shelf.getItems())
    println(shelf.removeItem("Властелин колец"))
    println(shelf.getItems())

    val rack = Rack(5)
    rack.addShelf(shelf)
    println(rack.getShelves())
    rack.printContents()
}

