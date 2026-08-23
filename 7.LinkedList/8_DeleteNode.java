/*
 * Problem: Delete a Node Without Head Pointer
 *
 * Key Idea:
 * Since the previous node is unavailable, copy the next node's
 * data into the current node, then skip the next node.
 *
 * Note:
 * The given node cannot be the last node because there is no
 * next node to copy from.
 *
 * Time: O(1)
 * Space: O(1)
 */

class Result {
    static void deleteNode(Node n1) {
        if (n1 == null || n1.next == null) {
            return;
        }

        n1.data = n1.next.data;
        n1.next = n1.next.next;
    }
}
