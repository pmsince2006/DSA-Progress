import java.util.*;
class Node
{
  int data; // data used as key value
  Node left;
  Node right;
  public Node()
  {
    data=0;
  }
  public Node(int d)
  {
    data=d;
  }
}

class Main
{
  static void inOrder(Node root)
  {
    if (root != null)
    {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }
 static Node buildTree(int arr[], int n) {
  return create(arr,0,n);
}
static Node create(int[] arr,int i, int n){
    if(i >= n){
        return null;
    }
    Node root = new Node(arr[i]);
    root.left = create(arr,2*i+1,n);
    root.right = create(arr,2*i+2,n);
    return root;
}
  public static void main(String[] args)
  {
    int n, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine().trim());
    int a[]=new int[n];
    for(i=0;i<n;i++)
      a[i] = Integer.parseInt(s.nextLine().trim());
    Node root = null;
    root = buildTree(a, n);
    inOrder(root);
  }
}
