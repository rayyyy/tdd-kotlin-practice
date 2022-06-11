import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

// TODO: 2022/06/11 $5+10CHF =$10 
// TODO: 2022/06/11 amount private 
// TODO: 2022/06/11 money 丸め 
// TODO: 2022/06/11 hashcode

internal class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}