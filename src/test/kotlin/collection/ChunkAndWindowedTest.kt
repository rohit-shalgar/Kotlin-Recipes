package collection

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/*
Problem
Given a collection of values, you want to process them by using a small window that traverses the collection.

Solution
Use the chunked function if you want to divide the collection into equal parts, or the windowed function
if you want a block that slides along the collection by a given interval.
 */

internal class ChunkAndWindowedTest {

    @Test
    internal fun chunked() {
        val range = 0..10
        val chunkedOutput = range.chunked(3)
        assertAll(
            { chunkedOutput.contains(listOf(0, 1, 2)) },
            { chunkedOutput.contains(listOf(3, 4, 5)) },
            { chunkedOutput.contains(listOf(6, 7, 8)) },
            { chunkedOutput.contains(listOf(9, 10)) }
        )
        assertTrue { range.chunked(3) { it.sum() } == listOf(3, 12, 21, 19) }
    }

    /*
        The chunked function is actually a special case of the windowed function.
         the implementation of chunked delegates to windowed.
     */
    @Test
    internal fun windowed() {
        val range = 0..10
        assertEquals(
            range.windowed(3, 3),
            listOf(
                listOf(0, 1, 2),
                listOf(3, 4, 5),
                listOf(6, 7, 8)
            )
        )
        assertEquals(
            range.windowed(3, 3, true),
            listOf(
                listOf(0, 1, 2),
                listOf(3, 4, 5),
                listOf(6, 7, 8),
                listOf(9, 10)
            )
        )

        assertEquals(
            range.windowed(3, 3, true) { it.sum() },
            listOf(
                3,
                12,
                21,
                19
            )
        )

        assertEquals(
            range.windowed(3, 1, true),
            listOf(
                listOf(0, 1, 2),
                listOf(1, 2, 3),
                listOf(2, 3, 4),
                listOf(3, 4, 5),
                listOf(4, 5, 6),
                listOf(5, 6, 7),
                listOf(6, 7, 8),
                listOf(7, 8, 9),
                listOf(8, 9, 10),
                listOf(9, 10),
                listOf(10)
            )
        )
    }
}

/*
The chunked and windowed functions are useful for processing time-series data in stages.
 */