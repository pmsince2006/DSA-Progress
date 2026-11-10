/* 
 *  class Node {
 *    int data;
 *    Node left; 
 *    Node right;
 *    public Node() {
 *      data = 0;
 *    }
 *    public Node(int d)  {
 *      data = d;
 *    }
 *  }
 *
 *  The above class defines a tree node.
 */
static void printLevelWise(Node root) {
  // Checking if null
    if(root == null){
        return;
    }

    // Storing in the queue
    Queue<Node> q = new LinkedList<>();
    
    q.offer(root);
    
    while(!q.isEmpty()){
        int len = q.size();
        for(int i = 0; i < len; i++){
            Node curr = q.poll();
            if(i == len - 1){
                System.out.print(curr.data);
            }
            else{
                System.out.print(curr.data + " ");
            }
            // Checking and Storing child nodes
            if(curr.left != null)q.offer(curr.left);
            if(curr.right != null)q.offer(curr.right);
        }  
        System.out.println(); 
    }
  
}
