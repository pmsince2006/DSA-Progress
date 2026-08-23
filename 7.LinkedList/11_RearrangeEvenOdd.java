/*
 * Problem: Rearrange a Doubly Linked List
 *
 * Key Idea:
 * Separate nodes at even and odd positions into two lists,
 * then connect the even-position list before the odd-position list.
 *
 * Example:
 * 1 <-> 2 <-> 3 <-> 4 <-> 5
 *        ↓
 * 2 <-> 4 <-> 1 <-> 3 <-> 5
 *
 * Time: O(n)
 * Space: O(1)
 */

static Node rearrangeList(Node head) {
    Node evenHead = null;
    Node evenTail = null;
    Node oddHead = null;
    Node oddTail = null;

    Node current = head;
    int position = 1;

    while (current != null) {
        Node next = current.next;

        // Detach current node
        current.next = null;
        current.prev = null;

        if (position % 2 == 0) {
            // Add to even-position list
            if (evenHead == null) {
                evenHead = current;
                evenTail = current;
            } else {
                evenTail.next = current;
                current.prev = evenTail;
                evenTail = current;
            }
        } else {
            // Add to odd-position list
            if (oddHead == null) {
                oddHead = current;
                oddTail = current;
            } else {
                oddTail.next = current;
                current.prev = oddTail;
                oddTail = current;
            }
        }

        current = next;
        position++;
    }

    // Connect even list to odd list
    if (evenHead != null) {
        evenTail.next = oddHead;

        if (oddHead != null) {
            oddHead.prev = evenTail;
        }
    }

    return evenHead != null ? evenHead : oddHead;
}
