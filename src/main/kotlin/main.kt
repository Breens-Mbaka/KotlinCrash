fun main() {
    //var is used to declare a variable that can change
    var number: Int = 20
    number = 25

    //val is used to declare variables that can't be changed
    val name: String = "Paul"

    /*Types are inferred during compile time
    and I can only call methods of the same type class */
    val name: String = "John"
    val upperCase = name.toUpperCase()

    //Suffixing the type with ? shows the value is a nullable type
    val position: String? = null

    //Conditional expressions helps reduce repetion in if-else conditions
    val message: String = if(count == 20) {
        "Yes there is seats"
    }
    else if (count < 20) {
        "No there is no seats"
    }
    else {
        "There is lots of seats remaining."
    }
    println(message)

    //When expressions are used as my if-else conditions become more complex
    val message = when {
        count == 20 -> "Yes there is seats"
        count < 20 -> "No there is no seats"
        else -> "There is lots of seats remaining"
    }
}
//Functions,declaring argumnets
fun generateMessage(countThreshold: Int): String {
    val message: String = if(count == countThreshold) {
        "Yes there is seats"
    }
    else if (count < countThreshold) {
        "No there is no seats"
    }
    else {
        "There is lots of seats remaining."
    }
    return message
}
//Calling the method that takes an argument
val resultMessage = generateMessage(20)