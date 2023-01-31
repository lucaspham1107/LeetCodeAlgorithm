fun main(args: Array<String>) {
    val listNode = ListNode(1,ListNode(2,ListNode(2,ListNode(1))))

    /*val circleNode = ListNode(1)
    val nodes = ListNode(0, circleNode)
    nodes.next?.next = ListNode(3,ListNode(4, circleNode))*/
    println(LinkedListSolution.isPalindrome(listNode).toString())
}