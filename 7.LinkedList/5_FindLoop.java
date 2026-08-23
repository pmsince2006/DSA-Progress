/*
 * Problem: Find the Length of a Loop in a Linked List
 *
 * Key Idea:
 * Use Floyd's Cycle Detection algorithm with slow and fast
 * pointers. Once they meet, traverse the loop once to count
 * its length.
 *
 * Return:
 * 0 → No loop
 * Loop length → If a cycle exists
 *
 * Time: O(n)
 * Space: O(1)
 */

class Result {
    static int loopInList(Node head) {
        if (head == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;

        // Detect cycle using Floyd's algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Count nodes in the loop
                int count = 1;
                Node current = slow.next;

                while (current != slow) {
                    count++;
                    current = current.next;
                }

                return count;
            }
        }

        return 0;
    }
}
