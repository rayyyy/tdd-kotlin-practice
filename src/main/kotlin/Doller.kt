class Doller(var amount: Int) {
    fun times(multiplier: Int): Doller {
        return Doller(amount*multiplier)
    }
}