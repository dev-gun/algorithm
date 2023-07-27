class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return nums.indexOfFirst { it >= target }.let {
            if (it == -1) nums.size else it
        }
    }
}