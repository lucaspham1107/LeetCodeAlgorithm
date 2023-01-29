fun main(args: Array<String>) {
    val nodes = ListNode(0)
    nodes.next = ListNode(1)
    nodes.next?.next = ListNode(2)
    nodes.next?.next?.next = ListNode(1)
    println(nodes.toString())
    println(LinkedListSolution.hasCycle(nodes))
}