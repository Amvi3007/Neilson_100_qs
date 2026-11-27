package Day4;

public class Reorder_list {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

    
        ListNode newnode = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode next = null;
        ListNode cur = newnode;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        ListNode newhead = prev;

        ListNode cur1 = head;
        ListNode cur2 = newhead;

        while (cur1 != null && cur2 != null) {

            ListNode next1 = cur1.next;
            ListNode next2 = cur2.next;

            cur1.next = cur2;
            cur2.next = next1;

            cur1 = next1;
            cur2 = next2;
        }
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

        reorderList(head);

        System.out.println("Reordered Linked List:");
        printList(head);
    }
}
