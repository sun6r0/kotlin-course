package lessons.lesson19.homeworks

// 7
class StringValidator : Validator<String?> {

    override fun validate(element: String?): Boolean {
        return element?.isNotBlank() ?: false
    }
}