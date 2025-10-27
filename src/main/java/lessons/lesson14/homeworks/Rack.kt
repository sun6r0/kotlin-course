package lessons.lesson14.homeworks

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf) : Boolean {
        if (shelves.contains(shelf) || shelves.size == maxShelves) {
            return false
        } else {
            shelves.add(shelf)
            return true
        }
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        } else {
            val items = shelves[index].getItems()
            shelves.removeAt(index)
            return items
        }
    }

    fun addItem(name: String): Boolean {
        if (shelves.isEmpty()) {
            return false
        } else {
            for (shelf in shelves){
                if (shelf.canAccommodate(name)){
                    return shelf.addItem(name)
                }
            }
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        return shelves.any{it.containsItem(name)}
    }

    fun getShelves() = shelves.toList()

    fun printContents() {
        for (i in shelves.indices) {
            val capacity = shelves[i].capacity
            val accessiblePlace = capacity - shelves[i].getItems().sumOf { it.length }
            val meta = "$i вместимость: $capacity доступно: $accessiblePlace"
            val items = shelves[i].getItems().joinToString()
            println(meta)
            println("Предметы: $items")
            println()
        }
    }

    fun advancedRemoveShelf(index: Int): List<String>{
        if (index !in shelves.indices) {
            return emptyList()
        }
        val notReplacedItems = mutableListOf<String>()
        for (item in shelves[index].getItems()) {
            if (shelves.none {it.addItem(item)}) {
                notReplacedItems.add(item)
            }
        }
        shelves.removeAt(index)
        return notReplacedItems.toList()
    }
}