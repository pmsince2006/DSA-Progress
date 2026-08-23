/*
 * Problem: Insert at Beginning and End of a Circular Linked List
 *
 * Key Idea:
 * Find the tail node, connect it to the new node, and maintain
 * the circular connection back to the head.
 *
 * Time: O(n)
 * Space: O(1)
 */

static LinkList insertBeg(LinkList head, int data) {
    LinkList newNode = new LinkList(data);

    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }

    LinkList tail = head;

    while (tail.next != head) {
        tail = tail.next;
    }

    tail.next = newNode;
    newNode.next = head;

    return newNode;
}

static LinkList insertEnd(LinkList head, int data) {
    LinkList newNode = new LinkList(data);

    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }

    LinkList tail = head;

    while (tail.next != head) {
        tail = tail.next;
    }

    tail.next = newNode;
    newNode.next = head;

    return head;
}
