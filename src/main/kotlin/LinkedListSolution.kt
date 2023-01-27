data class ListNode(var `val`: Int, var next: ListNode? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$`val` -> ${next.toString()}"
        } else {
            "$`val`"
        }
    }
}


object LinkedListSolution {
    /**
     * Brute force
     * Save all value of linked list to arr -> reverse arr -> save it to linked list again
     * SC: O(length of the list)
     * TC: O(length of the list)
     */

    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null
        var dummy = head
        var temp = head
        val arr = mutableListOf<Int>()
        while (dummy != null) {
            arr.add(dummy.`val`)
            dummy = dummy.next
        }
        arr.reversed().forEach {
            temp?.`val` = it
            temp = temp?.next
        }
        return head
    }
}