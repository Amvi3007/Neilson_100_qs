package Day3;

public class Remove_nth_node_from_end {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (n == 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = dummy;
        int count = 0;

        while (cur.next != null) {
            count++;
            cur = cur.next;
        }

        int k = count - n;

        cur = dummy;

        while (k > 0) {
            cur = cur.next;
            k--;
        }

        ListNode val = null;

        if (cur.next != null) {
            val = cur.next.next;
        }

        cur.next = val;

        return dummy.next;
    }

   
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

       
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.println("After Removing " + n + "th Node From End:");
        printList(head);
    }
}
