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
        if (head == null) return null
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

    /**
     * null -> 1->2->3->4->5 -> null -> null <- 1 <- 2
     *
     */
    fun reverseListV2(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }

    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        var entry = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow === fast) {
                while (slow !== entry) {
                    slow = slow?.next
                    entry = entry?.next
                }
                return entry
            }
        }
        return null
    }

    fun hasCycle(head: ListNode?): Boolean {
        var fast = head
        var slow = fast
        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
            if (slow != null) {
                if(fast == slow)
                    return true
            }
        }
        return false
    }
}