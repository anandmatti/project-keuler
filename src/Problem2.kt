package problem2

/*
Problem Statement:

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms
 */
fun main(args: Array<String>) {
//    val max = 4000000
    val max = 10
    println(sumOfEvenFibonacciNumbers(max))
}

fun sumOfEvenFibonacciNumbers(maxNumber: Int): Int? {
    var firstFibo = 1
    var secondFibo = 2
    if (maxNumber < secondFibo) {
        return 0
    } else if (maxNumber == secondFibo) {
        return secondFibo;
    }

    var sum = 0
    while (secondFibo < maxNumber) {
        if (secondFibo % 2 == 0) {
            sum += secondFibo
        }
        val nextFibo = firstFibo + secondFibo
        firstFibo = secondFibo
        secondFibo = nextFibo
    }

    return sum
}
