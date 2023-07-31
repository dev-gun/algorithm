class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val number = digits.joinToString("").toBigInteger()
        val result = number.plus(1.toBigInteger())

        return result.toString().map { it.toString().toInt() }.toIntArray()
    }
}