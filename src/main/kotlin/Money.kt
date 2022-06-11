abstract class Money() {
    protected abstract var amount: Int
    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            return this.amount == other.amount
        }
        return false
    }
}