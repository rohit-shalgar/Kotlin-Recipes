package oop

/*
Problem
You want to use the Nothing class idiomatically.

Solution
Use Nothing when a function never returns.

Generally functions returning exception are marked as Nothing type in Kotlin.
a function may return string or nothing(exception)
This is useful to compiler as Nothing is subtype of all types.
*/

fun doNothing(): Nothing = throw Exception("This does nothing.")