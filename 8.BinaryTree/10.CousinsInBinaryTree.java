import java.util.*;
class Result {
    static void printCousins(Node root, int k) {
        if(root == null || root.data == k) {
            System.out.print("-1");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean found = false;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                Node curr = q.poll();
                boolean isParent = false;
                // Check left child
                if(curr.leftChild != null &&
                   curr.leftChild.data == k) {
                    isParent = true;
                }
                // Check right child
                if(curr.rightChild != null &&
                   curr.rightChild.data == k) {
                    isParent = true;
                }
                // If parent of k found
                if(isParent) {
                    found = true;
                }
                else {
                    if(curr.leftChild != null) {
                        q.offer(curr.leftChild);
                    }
                    if(curr.rightChild != null) {
                        q.offer(curr.rightChild);
                    }
                }
            }
            // Stop after parent level
            if(found) {
                break;
            }
        }
        // No cousins
        if(q.isEmpty()) {
            System.out.print("-1");
            return;
        }
        // Print cousins
        while(!q.isEmpty()) {
            System.out.print(q.poll().data + " ");
        }
    }
}
