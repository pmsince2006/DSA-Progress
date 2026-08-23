/*
 * Problem: Forward and Backward Print of a Linked List
 *
 * Key Idea:
 * - Forward printing: print the current node before recursion.
 * - Backward printing: recurse first, then print the current node.
 *
 * Time: O(n)
 * Space: O(n) due to recursion stack
 */

static void forwardPrint(Node head) {
    if (head == null) {
        return;
    }

    System.out.print(head.data + "-");
    forwardPrint(head.next);
}

static void backwardPrint(Node head) {
    if (head == null) {
        return;
    }

    backwardPrint(head.next);
    System.out.print(head.data + "-");
}
