/*
 * Problem: Check if a Linked List is a Palindrome
 *
 * Key Idea:
 * Store all node values in an ArrayList, then use two pointers
 * to compare values from both ends.
 *
 * Return:
 * 1 → Palindrome
 * 0 → Not a Palindrome
 *
 * Time: O(n)
 * Space: O(n)
 */

class Result {
    static int checkPalindrome(Node head) {
        if (head == null) {
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        Node current = head;

        // Store linked list values
        while (current != null) {
            arr.add(current.data);
            current = current.next;
        }

        // Compare from both ends
        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) {
                return 0;
            }

            left++;
            right--;
        }

        return 1;
    }
}
