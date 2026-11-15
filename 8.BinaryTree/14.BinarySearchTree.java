class Result {
    static boolean check(Node root,int min,int max){
        if(root==null)return true;
        if(root.data>=max || root.data<=min)return false;
        return check(root.left,min,root.data) && check(root.right,root.data,max);
    }
  static int isBinarySearchTree(Node root) {
    if(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE))return 1;
      return 0;
  }
}
