package functional

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.assertThrows
import java.lang.UnsupportedOperationException
import kotlin.test.assertEquals

internal class ReduceFunctionTest {

    @Test
    internal fun `sum using reduce`() {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
        assertAll(
            { assertEquals(numbers.sum(), reduce(*numbers)) },
            { assertThrows<UnsupportedOperationException> { reduce() } }
        )
    }
}