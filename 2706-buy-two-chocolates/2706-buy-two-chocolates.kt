class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        val twoChocoPrice = prices.sorted().take(2).sum()

        return if (money >= twoChocoPrice) {
            money - twoChocoPrice
        } else {
            money
        }
    }
}