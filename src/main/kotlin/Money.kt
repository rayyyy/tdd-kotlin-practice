// TODO: 2022/06/11 $5+10CHF =$10
// TODO: 2022/06/11 money 丸め
// TODO: 2022/06/11 hashcode
// TODO: 2022/06/11 nullとの等価性比較
// TODO: 2022/06/11 他のオブジェクトとの等価性比較
open class Money(protected var amount: Int, protected var currency: String) {
    fun times(multiplier: Int): Money {
        return Money(this.amount*multiplier, currency)
    }

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            return this.amount == other.amount && this.currency() == other.currency()
        }
        return false
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }
        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}