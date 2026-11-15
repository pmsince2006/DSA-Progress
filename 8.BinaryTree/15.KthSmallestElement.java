static int count=0;
static int ans=0;
static void inorder(Node root,int k){
    if(root==null)return;
    inorder(root.left,k);
    count++;
    if(count==k){
        ans=root.data;
        return;
    }
    inorder(root.right,k);
}
  static int kSmallest(Node root, int k) {
    ans=0;
      count=0;
      inorder(root,k);
      return ans;
  }
