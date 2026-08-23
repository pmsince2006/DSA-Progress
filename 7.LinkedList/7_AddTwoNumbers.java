/*
 * Problem: Add Two Numbers Represented by Linked Lists
 *
 * Key Idea:
 * Traverse both lists simultaneously and add corresponding digits
 * along with the carry. Create a new node for each resulting digit.
 *
 * Time: O(max(n, m))
 * Space: O(max(n, m)) for the result list
 */

class Result {
    // Return the head of sum list
    static Node addListNumbers(Node head1, Node head2) {
        Node l1 = head1;
        Node l2 = head2;

        int carry = 0;

        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}
