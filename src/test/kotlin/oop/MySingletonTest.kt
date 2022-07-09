package oop

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class MySingletonTest {

    @Test
    internal fun `get property from Singleton class`() {

        var noOfInstances = MySingleton.instance
        assertTrue(noOfInstances == 1)
        incrementInstances()
        noOfInstances = MySingleton.instance
        assertTrue(noOfInstances == 2)
    }

    private fun incrementInstances() {
        MySingleton.updateInstance()
    }
}