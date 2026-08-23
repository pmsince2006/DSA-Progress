/*
 * Problem: Insert into a Sorted Circular Linked List
 *
 * Key Idea:
 * Find the correct position while maintaining the sorted order
 * and the circular connection.
 *
 * Time: O(n)
 * Space: O(1)
 */

class Result {
    static LinkList insertSorted(LinkList head, int data) {
        LinkList newNode = new LinkList(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        // Insert before head
        if (data <= head.data) {
            LinkList tail = head;

            while (tail.next != head) {
                tail = tail.next;
            }

            tail.next = newNode;
            newNode.next = head;

            return newNode;
        }

        // Find insertion position
        LinkList current = head;

        while (current.next != head && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
