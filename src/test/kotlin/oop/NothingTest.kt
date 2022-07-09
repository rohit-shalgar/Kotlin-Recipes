package oop

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class NothingTest {

    @Test
    internal fun `function that does not return anything,except exception`(){
        assertThrows<Exception> {doNothing()}
    }
}