/*
 * Problem: Shift Smallest to Front and Largest to End
 *
 * Key Idea:
 * Find the smallest and largest nodes along with their previous
 * nodes. Move the smallest node to the front and the largest
 * node to the end.
 *
 * Time: O(n)
 * Space: O(1)
 */

// Return the head of updated list
static Node shiftSmallLarge(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node smallest = head;
    Node largest = head;
    Node prevSmallest = null;
    Node prevLargest = null;

    Node prev = null;
    Node current = head;

    // Find smallest and largest nodes
    while (current != null) {
        if (current.data < smallest.data) {
            smallest = current;
            prevSmallest = prev;
        }

        if (current.data >= largest.data) {
            largest = current;
            prevLargest = prev;
        }

        prev = current;
        current = current.next;
    }

    // Move smallest node to the front
    if (smallest != head) {
        prevSmallest.next = smallest.next;
        smallest.next = head;
        head = smallest;
    }

    // Largest is already at the end
    if (largest.next == null) {
        return head;
    }

    // Find largest node and its previous node again
    current = head;
    prev = null;

    while (current != largest) {
        prev = current;
        current = current.next;
    }

    // Remove largest from its current position
    if (prev != null) {
        prev.next = largest.next;
    }

    // Move largest to the end
    current = head;
    while (current.next != null) {
        current = current.next;
    }

    current.next = largest;
    largest.next = null;

    return head;
}
