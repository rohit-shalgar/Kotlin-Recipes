package collection

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertTrue


/*
create map with keys
associate(it to it.toString()) //Pair
or newer versions use associateWith()
 */
internal class AssociateMapTest {

    @Test
    internal fun `create map with associate`() {
        val keys = 'A'..'F'
        val map = keys.associateWith { it.toString().repeat(5).capitalize() }
        assertAll(
            { assertTrue { map.size == 6 } },
            { assertTrue { map.values.size == 6 } },
            { assertTrue { map.containsValue("BBBBB") } },
            { assertTrue { map.containsValue("AAAAA") } },
            { assertTrue { map.containsValue("FFFFF") } }
        )
    }
}