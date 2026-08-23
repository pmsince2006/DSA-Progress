/*
 * Problem: Swap Two Nodes in a Doubly Linked List
 *
 * Key Idea:
 * Find the nodes containing x and y, then swap their next and
 * previous pointers while correctly updating their neighboring nodes.
 *
 * Important:
 * This swaps the actual nodes, not just their data.
 *
 * Time: O(n)
 * Space: O(1)
 */

// Return the head of updated list after swapping the two nodes
Node swapNodes(Node head, int x, int y) {
    if (head == null || x == y) {
        return head;
    }

    Node nodeX = null;
    Node nodeY = null;
    Node current = head;

    // Find both nodes
    while (current != null) {
        if (current.data == x) {
            nodeX = current;
        } else if (current.data == y) {
            nodeY = current;
        }

        if (nodeX != null && nodeY != null) {
            break;
        }

        current = current.next;
    }

    // If either node is not found
    if (nodeX == null || nodeY == null) {
        return head;
    }

    // Update previous nodes
    if (nodeX.prev != null) {
        nodeX.prev.next = nodeY;
    } else {
        head = nodeY;
    }

    if (nodeY.prev != null) {
        nodeY.prev.next = nodeX;
    } else {
        head = nodeX;
    }

    // Update next nodes
    if (nodeX.next != null) {
        nodeX.next.prev = nodeY;
    }

    if (nodeY.next != null) {
        nodeY.next.prev = nodeX;
    }

    // Swap next pointers
    Node tempNext = nodeX.next;
    nodeX.next = nodeY.next;
    nodeY.next = tempNext;

    // Swap previous pointers
    Node tempPrev = nodeX.prev;
    nodeX.prev = nodeY.prev;
    nodeY.prev = tempPrev;

    return head;
}
