package functional

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.math.BigInteger
import kotlin.test.assertEquals

internal class TailRecTest {

    @Test
    internal fun `factorial using recursive approach`() {
        val input = 3L
        val expectedFactorialValue = BigInteger.valueOf(6)
        val actualFactorialValue = recursiveFactorial(input)
        assertAll(
            { assertEquals(expectedFactorialValue, actualFactorialValue) },
            { assertEquals(recursiveFactorial(4), BigInteger.valueOf(24)) },
            { assertThrows<StackOverflowError> { recursiveFactorial(10_000) } }
        )
    }

    @Test
    internal fun `factorial using recursive approach with tail rec`() {
        val input = 3L
        val expectedFactorialValue = BigInteger.valueOf(6)
        val actualFactorialValue = recursiveFactorial(input)
        assertAll(
            { assertEquals(expectedFactorialValue, actualFactorialValue) },
            { assertEquals(recursiveFactorialTailRec(4), BigInteger.valueOf(24)) },
            { assertEquals(recursiveFactorialTailRec(75000).toString().length, 333061) }
        )
    }

}