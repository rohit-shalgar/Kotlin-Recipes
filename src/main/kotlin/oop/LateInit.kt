package oop

/*
Problem
    You don’t have enough information to initialize a property in a constructor, but you don’t want to have to make the property nullable as a result.

Solution
    Use the lateinit modifier on your property.
 */
class LateInitDemo {
    private lateinit var name: String

    fun initializeName() {
        println("Before assignment: ${::name.isInitialized}")
        name = "World"
        println("After assignment: ${::name.isInitialized}")
    }
}

fun main() {
    LateInitDemo().initializeName()
}