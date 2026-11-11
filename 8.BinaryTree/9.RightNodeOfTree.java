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
class Result {
  static int findRightSibling(Node root, int key) {
    // Write your code here
      if(root == null){
          return -1;
      }
      Queue<Node> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
          int size = q.size();
          for(int i = 0; i < size; i++){
              Node curr = q.poll();
              if(curr.data == key){
                  if(i != size - 1){
                  return q.peek().data;
              }
           }
              if(curr.left != null) q.offer(curr.left);
              if(curr.right != null) q.offer(curr.right);
         }
      }
      return -1;
  }
}
