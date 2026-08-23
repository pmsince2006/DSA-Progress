/*
 * Problem: Split a Circular Linked List into Two Halves
 *
 * Key Idea:
 * Use slow and fast pointers to find the middle. Then break the
 * circular list into two separate circular lists.
 *
 * Time: O(n)
 * Space: O(1)
 */

class Result {
    static LinkList listCut(LinkList head) {
        if (head == null) {
            return null;
        }

        LinkList slow = head;
        LinkList fast = head;

        // Find the middle
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkList newHead = slow.next;

        // Find the last node
        LinkList tail = head;

        while (tail.next != head) {
            tail = tail.next;
        }

        // Close first circular list
        slow.next = head;

        // Close second circular list
        tail.next = newHead;

        return newHead;
    }
}
