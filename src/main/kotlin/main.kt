fun main(args: Array<String>) {
    val nodes = ListNode(0)
    nodes.next = ListNode(1)
    nodes.next?.next = ListNode(2)
    println( LinkedListSolution.reverseList(nodes).toString())
}