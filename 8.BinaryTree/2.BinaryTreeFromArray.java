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

    if (n == 0) {
        return null;
    }

    Node[] nodes = new Node[n];

    // Create all nodes
    for (int i = 0; i < n; i++) {
        nodes[i] = new Node(arr[i]);
    }

    // Connect left and right children
    for (int i = 0; i < n; i++) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n) {
            nodes[i].left = nodes[left];
        }

        if (right < n) {
            nodes[i].right = nodes[right];
        }
    }

    return nodes[0];
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
