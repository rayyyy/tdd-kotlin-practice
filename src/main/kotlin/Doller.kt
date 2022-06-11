
// TODO: 2022/06/11 $5+10CHF =$10
// TODO: 2022/06/11 money 丸め
// TODO: 2022/06/11 hashcode
// TODO: 2022/06/11 nullとの等価性比較
// TODO: 2022/06/11 他のオブジェクトとの等価性比較
// TODO: 2022/06/11 DollarとFrancの重複 
// TODO: 2022/06/11 equalsの一般化 
// TODO: 2022/06/11 timesの一般化

class Dollar(override var amount: Int) : Money() {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount*multiplier)
    }
}