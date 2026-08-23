/*
 * Problem: Rotate a Doubly Linked List by K Positions
 *
 * Key Idea:
 * Find the length, reduce k using k % length, then split the list
 * at the (length - k)th node. Connect the old tail to the old head.
 *
 * Time: O(n)
 * Space: O(1)
 */

static LinkList rotateByK(LinkList head, int k) {
    if (head == null || k == 0) {
        return head;
    }

    // Find length and tail
    int len = 1;
    LinkList tail = head;

    while (tail.next != null) {
        len++;
        tail = tail.next;
    }

    k = k % len;

    if (k == 0) {
        return head;
    }

    // Find the node before the new head
    int steps = len - k;
    LinkList current = head;

    for (int i = 1; i < steps; i++) {
        current = current.next;
    }

    LinkList newHead = current.next;

    // Break the list
    current.next = null;
    newHead.prev = null;

    // Connect old tail to old head
    tail.next = head;
    head.prev = tail;

    return newHead;
}
