import java.util.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class Singly {
//    static Node arrtoll(int[] arr){
//        Node head = new Node(arr[0]);
//        Node mover = head;
//        for(int i = 1; i < arr.length;i++){
//            Node temp = new Node(arr[i]);
//            mover.next = temp;
//            mover = temp;
//        }
//        return head;
//    }

    static void printm(Node head){
        if(head == null) return;
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
//        printm(ll);
    }
}
