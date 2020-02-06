package problem1

/*
Problem Statement:

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

 */
fun main(args: Array<String>) {
    val max = 1000
    val factors = listOf(3, 5)
    println(sumOfMultiples(max, factors))
}

fun sumOfMultiples(maxNumber: Int, factors: List<Int>): Int? {
    var i = 0
    var sum = 0
    while (i < maxNumber) {
        for (factor in factors) {
            if (i % factor == 0) {
                sum += i
                break
            }
        }
        i++
    }

    return sum
}
