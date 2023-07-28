class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val result = nums.filterNot { it == `val` }.also { println(it) }.size

        nums.filterNot { it == `val` }.forEachIndexed { i, value ->
            nums[i] = value
        }

        return result
    }
}