// Maximum height in Binary Tree
class Result {
  static int treeHeight(Node root) {
      if(root == null){
          return -1;
      }
      return 1 + Math.max(treeHeight(root.left),treeHeight(root.right));
  }
}
