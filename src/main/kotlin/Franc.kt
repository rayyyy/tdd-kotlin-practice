class Franc(override var amount: Int): Money() {
    fun times(multiplier: Int): Franc {
        return Franc(amount*multiplier)
    }
}