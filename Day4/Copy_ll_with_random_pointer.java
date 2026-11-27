package Day4;
import java.util.HashMap;

public class Copy_ll_with_random_pointer {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        Node cur1 = null;
        while(cur!=null){
            cur1 = map.get(cur);
            cur1.next = map.get(cur.next);
            cur1.random = map.get(cur.random);

            cur = cur.next;
            cur1 = cur1.next;
        }

        return map.get(head);
        
    }

    
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print("Value: " + temp.val);

            if (temp.random != null) {
                System.out.print(", Random: " + temp.random.val);
            } else {
                System.out.print(", Random: null");
            }

            System.out.println();

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        
        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        System.out.println("Original List:");
        printList(head);

        Node copied = copyRandomList(head);

        System.out.println("\nCopied List:");
        printList(copied);
    }
}
