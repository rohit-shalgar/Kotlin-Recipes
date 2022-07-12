package collection

data class Product(
    val name: String,
    val price: Double,
    val isOnSale: Boolean = false
)

/*
isEmpty() is similiar to the one in Java for optional class.
 */
fun isEmpty(products: List<Product>): String {
    return products.filter { product -> product.isOnSale }
        .map { product -> product.name }
        .joinToString(",")
        .ifEmpty { "none" }
}