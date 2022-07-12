package collection

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SortingTest {
    private var golfers = listOf<Golfer>()

    @BeforeEach
    fun setup() {
        golfers = listOf(
            Golfer(70, "Jack", "Nicklaus"),
            Golfer(68, "Tom", "Watson"),
            Golfer(68, "Bubba", "Watson"),
            Golfer(70, "Tiger", "Woods"),
            Golfer(68, "Ty", "Webb")
        )
    }


    @Test
    internal fun sortGolfersAndPrint() {

        //sortedWith takes comparator and compareBy produces a comparator
        //Here compare by produces a comparator which sorts by score then last and first name.
        val sortedGolfers = golfers.sortedWith(
            compareBy({ it.score }, { it.last }, { it.first })
        )
        sortedGolfers.forEach { println(it) }
    }

    @Test
    internal fun sortGolfersAndPrint_withComparator() {
        val comparator = compareBy(Golfer::score)
            .thenBy { it.last }
            .thenBy { it.first }
        golfers.sortedWith(comparator).forEach(::println)

    }
}