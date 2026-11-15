class Result {
    static Node insert(Node root,int val){
        if(root==null)return new Node(val);
        if(root.data<val){
            root.rightChild=insert(root.rightChild,val);
        }
        else{
            root.leftChild=insert(root.leftChild,val);
        }
        return root;
    }
  static Node buildSearchTree(int t[], int n) {
    Node root = null;
    // Complete the function body.
      for(int i=0;i<n;i++){
          root=insert(root,t[i]);
      }
    return(root);
  }
}
