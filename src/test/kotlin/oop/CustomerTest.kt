package oop

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class CustomerTest {

    @Test
    internal fun `load messages only when the function is called`(){
        val customer = Customer("Rohit").apply { messages }
        assertTrue(customer.messages.size == 2)

    }

    @Test
    internal fun `load messages only when the function is called using lazy loading`(){
        val customer = CustomersLazy("Rohit")
        assertTrue(customer.messaged.size == 2)
        assertTrue(customer.messaged.size == 2)

    }

    @Test
    internal fun `check if the customer references are equal`(){
        val customer = Customer("Rohit")
        val otherCustomer = Customer("Rohit")
        assertEquals(customer,otherCustomer)
        assertTrue(customer == otherCustomer)
    }


}