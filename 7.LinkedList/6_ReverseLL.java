/*
 * Problem: Reverse a Linked List
 *
 * Key Idea:
 * Use three pointers: prev, current, and next.
 * Reverse each link one by one and move forward through the list.
 *
 * Time: O(n)
 * Space: O(1)
 */

class Result {
    // Return the new head of reversed list
    static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next; // Save next node
            current.next = prev;      // Reverse the link
            prev = current;
            current = next;
        }

        return prev;
    }
}
