class Solution {
    fun isPalindrome(x: Int) = isPalindromeByStr(x.toString())

    private fun isPalindromeByStr(x: String): Boolean {
        val reverseX = x.reversed()

        return x == reverseX
    }
}