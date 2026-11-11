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
  static void printAllPaths(Node root) {
    if(root == null){
        return;
    }
      int[] total = new int[1];
      ArrayList<Integer> path = new ArrayList<>();
      print(total,path,root);
      System.out.println(total[0]);
  }
static void print(int[] total,ArrayList<Integer> path,Node root){
    if(root == null){
        return;
    }
    path.add(root.data);
    if(root.left == null && root.right == null){
        for(int num : path){
            System.out.print(num + " ");
        }
        System.out.print(path.size() - 1);
        total[0]++;
    }
    print(total,path,root.left);
    print(total,path,root.right);
    path.remove(path.size() - 1);
}
