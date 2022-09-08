
fun main() {
    for (it in 1..100) {
        println(fizzbuzz(it))
    }
}

fun fizzbuzz(target: Int): String {
    return when {
        target % 3 == 0 && target % 5 == 0 -> "FizzBuzz"
        target % 5 == 0 -> "Buzz"
        target % 3 == 0 -> "Fizz"
        else -> target.toString()
    }
}
