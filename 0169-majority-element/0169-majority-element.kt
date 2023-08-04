class Solution {
    fun majorityElement(nums: IntArray): Int {
        return nums.groupBy { it }
            .map { it.key to it.value.size }
            .sortedBy { it.second }
            .reversed()
            .take(1)
            .first()
            .first
    }
}