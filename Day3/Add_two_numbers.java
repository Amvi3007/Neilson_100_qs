package Day3;

public class Add_two_numbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode dummy = new ListNode(0);

        int sum = cur1.val + cur2.val;
        int carry = sum / 10;
        sum = sum % 10;

        ListNode cur = null;
        cur = new ListNode(sum);

        dummy.next = cur;

        cur1 = cur1.next;
        cur2 = cur2.next;

        while (cur1 != null || cur2 != null || carry > 0) {

            sum = carry;

            if (cur1 != null) {
                sum += cur1.val;
                cur1 = cur1.next;
            }

            if (cur2 != null) {
                sum += cur2.val;
                cur2 = cur2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // First number: 342 (stored as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Second number: 465 (stored as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println("First Number:");
        printList(l1);

        System.out.println("Second Number:");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Sum:");
        printList(result);
    }
}
