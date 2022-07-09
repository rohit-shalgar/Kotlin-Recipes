package oop

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TaskTest {

    @Test
    internal fun `priority below min is min`(){
        val task = Task("low priority",Task.MIN_PRIORITY-1)
        assertEquals(task.priority,Task.MIN_PRIORITY)
    }

    @Test
    internal fun `priority above max is max`(){
        val task = Task("High priority",Task.MAX_PRIORITY + 1)
        assertEquals(task.priority,Task.MAX_PRIORITY)
    }

    @Test
    internal fun `priority not provided is default and then updated`(){
        val task = Task("default priority")
        assertEquals(task.priority,Task.DEFAULT_PRIORITY)
        task.priority = 8
        assertEquals(task.priority,Task.MAX_PRIORITY)
    }

    @Test
    internal fun `priority in between is same `(){
        val task = Task("Some priority",4)
        assertEquals(task.priority,4)
    }

}