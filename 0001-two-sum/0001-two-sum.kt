class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((i, left) in nums.withIndex()) {
            for ((j, right) in nums.withIndex()) {
                if(i == j) break

                if((left + right) == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}
