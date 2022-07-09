package oop

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class ShallowCopyKtTest {

    @Test
    internal fun `data copy function is shallow`() {
        val item1 = Order(Product("baseball", 10.0f), 5)
        val item2 = item1.copy()

        assertAll(
            { assertTrue(item1 == item2) },
            { assertFalse(item1 === item2) },
            { assertTrue(item1.product == item2.product) },
            { assertTrue(item1.product === item2.product) }
        )
    }
}