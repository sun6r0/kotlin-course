package lessons.lesson25.homeworks

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun ex1(fnc: () -> Any): Long {
    val start = System.currentTimeMillis()
    fnc()
    return System.currentTimeMillis() - start
}


//Задание 3

fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
       """.trimIndent())
    }
}


fun Person?.toEmployee(position: String, depart: String): Employee? {
    return this?.let {
        Employee(it.name, it.age, position).apply {
            email = it.email
            department = depart
        }
    }
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(ex1(myFunction))

    val em = Employee("Ivan", 23, "QA Engineer").apply {
        email = "ivan@gm.com"
        department = "dep1"
    }

    val person2 = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee2 = person2.run {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }

    val person3 = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = with(person3) {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }

    val person = Person("Anna", 26).also {
        it.email = "anna@gm.com"
        printPerson(it)
    }
}