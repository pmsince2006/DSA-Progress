// Declaration of a tree class
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
    }
}


public class Implementation {
    // Traversing and diplaying the nodes in a tree
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.data);
        display(root.left);
        display(root.right);
    }

    // Size of a tree
    static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    //Sum of values of a Nodes in a tree
    static int sum(Node root){
        if(root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    // Product of values of Nodes in a tree
    static int product(Node root){
        if(root == null) return 1;
        return root.data * product(root.left) * product(root.right);
    }

    // Maximum Value in a binary tree
    static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left),max(root.right)));
    }

    // Levels in a Binary Tree
    static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);

//        display(root);
//        System.out.println(size(root));
//        System.out.println(sum(root));
//        System.out.println(product(root));
//        System.out.println(max(root));
        System.out.println(levels(root));
    }
}

