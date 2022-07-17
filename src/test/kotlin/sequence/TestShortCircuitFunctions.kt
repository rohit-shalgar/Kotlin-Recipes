package sequence

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
    first() function in the source code is an example of short-circuiting in kotlin
    it terminates the sequence and without terminal operation such as first() sequence will never be
    executed.
 */
class TestShortCircuitFunctions {

    @Test
    fun `find first number divisible by 3 without using sequence`(){
        assertEquals(204, findFirstWithoutSequence())
    }

    @Test
    fun `find first number divisible by 3 with sequence`(){
        assertEquals(204, findFirstWithSequence())
    }
}