package lessons.lesson19.homeworks
// 8
class OddValidator : Validator<Int> {

    override fun validate(element: Int): Boolean {
        return element % 2 == 0
    }
}