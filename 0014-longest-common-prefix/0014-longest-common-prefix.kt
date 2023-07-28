class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val first = strs[0]

        var result = ""
        for (i in first.indices) {
            val target = first.filterIndexed { index, _ ->
                index <= i
            }
            val filteredSize = strs.filter { it.startsWith(target) }.size
            if (filteredSize != strs.size) {
                break
            }
            result = target
        }

        return result
    }
}