
class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount*multiplier)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj is Dollar) {
            return this.amount == obj.amount
        }
        return false
    }
}