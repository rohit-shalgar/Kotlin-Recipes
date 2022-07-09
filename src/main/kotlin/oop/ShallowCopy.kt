package oop

data class Order(val product: Product, val quantity: Int)

data class Product(val name: String, val price:Float)


// === checks for refs after equals is added.
// copy method on data class creates a shallow copy
// deep copy - it creates a new object and copies the values.

fun main() {
    //destructing using component1,component2 set by data classes.
    val(product,quan) = Order(Product("",12.3f),5)
    println(product)
    println(quan)

}
