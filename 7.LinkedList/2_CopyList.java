/*
 * Problem: Copy a Linked List
 *
 * Key Idea:
 * Traverse the original list and create a new node for each
 * node, copying only its data while maintaining the same order.
 *
 * Time: O(n)
 * Space: O(n) for the new linked list
 */

static Node copyList(Node head) {
    if (head == null) {
        return null;
    }

    Node dummy = new Node(0);
    Node copy = dummy;
    Node current = head;

    while (current != null) {
        copy.next = new Node(current.data);
        copy = copy.next;
        current = current.next;
    }

    return dummy.next;
}
