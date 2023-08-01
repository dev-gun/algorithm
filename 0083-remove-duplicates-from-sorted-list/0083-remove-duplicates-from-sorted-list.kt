/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if(head == null) {
            return null
        }
        var prev = head
        var current = head.next
        while (prev?.next != null) {
            if (prev.`val` == current!!.`val`) {
                prev.next = current.next
            } else {
                prev = current
            }
            current = current.next
        }
        return head
    }
}