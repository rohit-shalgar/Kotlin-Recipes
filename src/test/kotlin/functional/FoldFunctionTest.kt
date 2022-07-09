package functional

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

internal class FoldFunctionTest {

    @Test
    internal fun `sum using fold`() {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
        assertEquals(numbers.sum(), sum(*numbers))
    }

    @Test
    internal fun `factorial using recursive approach`() {
        val input = 3L
        val expectedFactorialValue = BigInteger.valueOf(6)
        val actualFactorialValue = recursiveFold(input)
        checkIfTheFactorialValuesAreSame(expectedFactorialValue, actualFactorialValue)
    }

    @Test
    internal fun `factorial using fold  approach`() {
        val input = 3L
        val expectedFactorialValue = BigInteger.valueOf(6)
        val actualFactorialValue = recursiveFactorial(input)
        checkIfTheFactorialValuesAreSame(expectedFactorialValue, actualFactorialValue)
    }

    @Test
    internal fun `fibonacci using fold`() {
        val expectedFibSum = 8
        val actualFibSum = fibonacciUsingFold(6)
        assertEquals(expectedFibSum, actualFibSum)

    }

    private fun checkIfTheFactorialValuesAreSame(
        expectedFactorialValue: BigInteger,
        actualFactorialValue: BigInteger
    ) {
        assertEquals(expectedFactorialValue, actualFactorialValue)
    }

}