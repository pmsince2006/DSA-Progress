class Result {
  static int lowestCommonAncestor(Node root, int k1, int k2) {
    while(root!=null){
        if(k1<root.data && k2<root.data){
            root=root.left;
        }
        if(k1>root.data && k2>root.data){
            root=root.right;
        }
        else{
            return root.data;
        }
    }
      return -1;
  }
}
