//simplyfying function declaration
fun generateMessage(countThreshold: Int): String = if (count > countThreshold) {
} "No more seats"
else {
    "There is seats"
}

//Anonymous functions takes an input of String and return the value an Integer
val stringLengthFunc: (String) -> Int = {
    input -> input.length
}

//Called same as other functions
val stringLength: Int = stringLengthFunc("Thomas")
println(stringLength)