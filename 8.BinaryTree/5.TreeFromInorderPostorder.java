/* 
 *  class Node {
 *    int data;
 *    Node leftChild; 
 *    Node rightChild;
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
    static int postin;
  static Node buildTree(int in[], int post[], int N) {
      postin = N-1;
      return build(in,post,0,N-1);
  }
    static Node build(int[] in,int[] post,int start, int end){
        if(start > end){
            return null;
        }
        Node root = new Node(post[postin--]);
        if(start == end){
            return root;
        }
        int inin = search(in, start,end,root.data);
        root.rightChild = build(in,post,inin+1,end);
        root.leftChild = build(in,post,start,inin - 1);
        return root;
    }
    
    static int search(int[] in, int start,int end,int val){
        for(int i = start; i<= end; i++){
            if(in[i] == val){
                return i;
            }
        }
        return -1;
    }
}
