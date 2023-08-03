class Solution {
    fun singleNumber(nums: IntArray) =
        nums.groupBy { it }
            .filter { it.value.size == 1 }
            .map(Map.Entry<Int, List<Int>>::key)
            .first()
}