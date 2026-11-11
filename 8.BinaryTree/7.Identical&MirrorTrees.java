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
// Identical Trees 
class Result {
  /* 
   * @Input
   *   t1, t2 -> Given the root node of two binary trees
   *
   * @Output
   *   Return 1 if the two binary trees are identical, else return 0 
   */  
  static int areSameTree(Node t1, Node t2) {
    // Write your code here
      if(t1 == null && t2 == null){
          return 1;
      }
      if(t1 == null || t2 == null){
          return 0;
      }
      if(t1.data != t2.data){
          return 0;
      }
      return (areSameTree(t1.left,t2.left) == 1) && (areSameTree(t1.right,t2.right) == 1) ? 1 : 0;
  }
}

// Converting to a Mirror Tree 
static Node findMirror(Node root) {
  if(root == null){
      return null;
  }
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;
    
    findMirror(root.left);
    findMirror(root.right);
    return root;
}
