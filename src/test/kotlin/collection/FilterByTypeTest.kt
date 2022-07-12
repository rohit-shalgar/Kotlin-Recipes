package collection

import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class FilterByTypeTest {

    @Test
    internal fun filterIsInstance() {
        val list = listOf("a", LocalDate.now(), 3, 1, 4, "b")
        val strings = list.filterIsInstance<String>()
        val ints = list.filterIsInstance<Int>()
        val dates = list.filterIsInstance<LocalDate>()
        assertTrue { strings.containsAll(listOf("a", "b")) }
        assertTrue { ints.containsAll(listOf(1, 3, 4)) }
        assertEquals(dates[0], LocalDate.now())
    }

/*
    public inline fun <reified R> Iterable<*>.filterIsInstance(): List<R> {
    return filterIsInstanceTo(ArrayList<R>())
}
*/
  //  The reified keyword applied to an inline function preserves the type, so the returned type is List<R>.
/*
    filterIsInstance function uses reified types,
    so the resulting collections are of a known type, and you don’t have to check the type before using its properties.
 */
}