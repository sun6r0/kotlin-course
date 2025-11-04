package lessons.lesson16.homeworks

import lessons.lesson16.homeworks.Five.Logger
import lessons.lesson16.homeworks.One.Bird
import lessons.lesson16.homeworks.One.Cat
import lessons.lesson16.homeworks.One.Dog
import lessons.lesson16.homeworks.Three.InkjetPrinter
import lessons.lesson16.homeworks.Three.LaserPrinter
import lessons.lesson16.homeworks.Two.Circle
import lessons.lesson16.homeworks.Two.Shape
import lessons.lesson16.homeworks.Two.Square
import lessons.lesson16.homeworks.Two.Triangle
import kotlin.math.log

fun  main() {

    val cat = Cat()
    cat.makeSound()

    val bird = Bird()
    bird.makeSound()

    val dog = Dog()
    dog.makeSound()

    val shapes: Array<Shape> = arrayOf(Square(2), Circle(5), Triangle(2, 5))
    for (shape in shapes) {
        shape.area()
    }

    val laserPrinter = LaserPrinter()
    laserPrinter.print("Lorem Ipsum is simply dummy text")

    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.print("Lorem Ipsum is simply dummy text Lorem Ipsum is simply dummy textLorem Ipsum is simply dummy textLorem Ipsum is simply dummy textLorem Ipsum is simply dummy textLorem Ipsum is simply dummy textLorem Ipsum is simply dummy textLorem Ipsum is simply dummy text")

    val logger = Logger()
    logger.log("ABOBA")
    logger.log("KEK", "WARNING")
    logger.log("SAS", "ERROR")
    logger.log(listOf("POPA", "PISA"))

    try {
        throw ArrayIndexOutOfBoundsException("Lorem Ipsum is simply dummy text of the printing")
    } catch (e: ArrayIndexOutOfBoundsException) {
        logger.log(e)
    }
}