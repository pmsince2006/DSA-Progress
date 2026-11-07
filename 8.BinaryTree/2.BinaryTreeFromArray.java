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
    if(n == 0){
        return null;
    }
  Node root = new Node(arr[0]);
    Queue<Node> q = new LinkedList<>();
    q.add(root);
  int i = 1;
    while( i < n ){
        Node temp = q.poll();
        temp.left = new Node(arr[i]);
        q.add(temp.left);
        i++;
        if (i < n) {
            temp.right = new Node(arr[i]);
            q.add(temp.right);
            i++;
        }
    }

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
