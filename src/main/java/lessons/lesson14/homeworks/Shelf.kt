package lessons.lesson14.homeworks

class Shelf(var capacity: Int)
{
    private val items = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) {
            return false
        } else capacity - name.length
        items.add(name)
        return true
    }

    fun removeItem(name: String): Boolean {
        return if (containsItem(name)) {
            items.remove(name)
        } else false
    }

    fun canAccommodate(name: String): Boolean {
        val currentAccommodation = items.sumOf {
            it.length
        }
        return currentAccommodation + name.length <= capacity
    }

    fun containsItem(name: String): Boolean {
        return getItems().contains(name)
    }

    fun getItems(): List<String> {
        return items
    }
}