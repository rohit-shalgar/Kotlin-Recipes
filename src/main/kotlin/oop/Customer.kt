package oop


/*
Problem
You have a property of a class that you want to expose to clients,
 but you need to control how it is initialized or read.

Solution
Define a second property of the same type and use a custom getter+
 and/or setter to provide access to the property you care about.
 */

// _messages is known as backing field
//we use it to set messages , messages are loaded only once when they are requested
// this is known as lazy loading.
class Customer(private val name: String) {
    private var _messages: List<String>? = null

    val messages: List<String>
        get() {
            if (_messages == null) {
                _messages = loadMessages()
            }
            return _messages!!
        }

    private fun loadMessages(): MutableList<String> {
        return mutableListOf(
            "Started Kotlin",
            "Lets go"
        ).also { println("Loaded all the messages") }
    }

    /*
Problem
You want to provide a good implementation of the equals method in a class, so that instances can be checked for equivalence.

Solution
Use the reference equality operator (===), the safe casting function (as?), and the Elvis operator (?:) together.

 */
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        val otherCustomer = (other as? Customer) ?: return false

        return this.name == otherCustomer.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

}

class CustomersLazy(val name: String) {
    val messaged: List<String> by lazy { loadMessages() }

    private fun loadMessages(): MutableList<String> {
        return mutableListOf(
            "Started Kotlin",
            "Lets go"
        ).also { println("Loaded all the messages") }
    }
}
