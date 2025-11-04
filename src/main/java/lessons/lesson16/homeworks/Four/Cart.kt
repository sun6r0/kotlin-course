package lessons.lesson16.homeworks.Four

class Cart () {

    val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) :MutableMap<Int, Int> {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
        return items
    }

    fun addToCart(map: Map<Int, Int>) {
        map.forEach {addToCart(it.key, it.value)}
    }

    fun addToCart(listItemId: List<Int>) :MutableMap<Int, Int> {
        listItemId.forEach {addToCart(it)}
        return items
    }

    override fun toString(): String {
        var countAmount = items.values.sum()
        var countId = items.size
        var list = items.map { "Артикул: ${it.key}      Кол-во: ${it.value}" }
            .joinToString { "\n" }
        return  list + "Всего артикулов: ${items.size}\nВсего товаров: $countAmount\n"
    }
}