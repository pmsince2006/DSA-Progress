/*
 * Problem: Count Nodes in a Circular Linked List
 *
 * Key Idea:
 * Start from the head and keep traversing until we reach the
 * head again.
 *
 * Time: O(n)
 * Space: O(1)
 */

class Result {
    static int countNodes(Node head) {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}
