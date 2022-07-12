package collection

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

internal class IsEmptyTest {

    private val overthruster = Product("Oscillation Overthruster", 1_000_000.0)
    private val fluxcapacitor = Product("Flux Capacitor", 299_999.95, isOnSale = true)
    private val tpsReportCoverSheet = Product("TPS Report Cover Sheet", 0.25)

    private val products = listOf(overthruster, fluxcapacitor, tpsReportCoverSheet)

    @Test
    fun productOnSale() {
        onSaleProduct(products)
    }

    @Test
    fun productNotOnSale() {
        val nonSaleProducts = listOf(overthruster, tpsReportCoverSheet)
        checkForNoProductsOnSale(nonSaleProducts)
    }

    private fun onSaleProduct(products: List<Product>) {
        assertEquals("Flux Capacitor", isEmpty(products))
    }

    private fun checkForNoProductsOnSale(nonSaleProducts: List<Product>) {
        assertEquals("none", isEmpty(nonSaleProducts))
    }
}