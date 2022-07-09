package functional

import java.math.BigInteger

/*
Problem
You want to implement an iterative algorithm in a functional way.

Solution
Use the fold function to reduce a sequence or collection to a single value.
 */
fun sum(vararg numbers: Int): Int {
    return numbers.fold(0) { acc, n -> acc + n }
}

fun recursiveFactorial(number: Long): BigInteger =
    when (number) {
        0L, 1L -> BigInteger.ONE
        else -> BigInteger.valueOf(number) * recursiveFactorial(number - 1)
    }

fun recursiveFold(input: Long): BigInteger =
    when (input) {
        0L, 1L -> BigInteger.ONE
        else -> (2..input).fold(BigInteger.ONE) { acc, i ->
            acc * BigInteger.valueOf(i)
        }
    }

fun fibonacciUsingFold(number: Int): Int {
    return (2 until number).fold(1 to 1) { (prev, curr), _ ->
        curr to (prev + curr)
    }.second

}