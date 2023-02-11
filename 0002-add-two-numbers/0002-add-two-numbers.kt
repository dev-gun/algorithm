/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
fun addNode(left: ListNode?, right: ListNode?) = (left?.`val` ?: 0) + (right?.`val` ?: 0)

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var cursorLeft = l1
        var cursorRight = l2

        var root: ListNode? = null
        var cursor: ListNode? = null

        var carry = 0
        while (cursorLeft != null || cursorRight != null || carry > 0) {
            val sum = addNode(cursorLeft, cursorRight) + carry
            carry = if (sum > 9) 1 else 0

            ListNode(sum % 10).also {
                if (root == null) {
                    root = it
                    cursor = it
                } else {
                    cursor?.next = it
                    cursor = it
                }
            }
            cursorLeft = cursorLeft?.next
            cursorRight = cursorRight?.next
        }
        return root
    }
}