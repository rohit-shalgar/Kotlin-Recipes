package oop

/*
Problem
You want to ensure that only one instance of a class is available.

Solution
Use the object keyword instead of class.

object class is decoupled to singleton in Java
    - private constructor
    - static factory method
    - private static final variables.
 */
object MySingleton {
    var instance = 1
    fun updateInstance() = instance++
}
