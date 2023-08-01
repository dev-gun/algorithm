class Solution {
    fun lengthOfLastWord(s: String): Int {
        val words = s.trim().split(" ")
        
        return words.last().length
    }
}