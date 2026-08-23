/*
 * Problem: Check if a Linked List is Circular
 *
 * Key Idea:
 * Traverse the list and check whether any node points back to
 * the head. A null reference means the list is not circular.
 *
 * Time: O(n)
 * Space: O(1)
 */

static int isCircular(Node head) {
    if (head == null) {
        return 1;
    }

    Node current = head;

    while (current != null) {
        if (current.next == head) {
            return 1;
        }

        current = current.next;
    }

    return 0;
}
