package Day5;
import java.util.*;

public class Merge_K_Sorted_lists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {

        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->(Integer.compare(a.val, b.val)));
            for(ListNode l:lists){
                if(l!=null){
                    pq.add(l);
                }
            }

            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;
            while(!pq.isEmpty()){
                ListNode s = pq.poll();
                tail.next = s;
                tail = tail.next;
                if(s.next!=null){
                    pq.offer(s.next);
                }
            }

            return dummy.next;
            
        }
    }

   
    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int num : arr) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }

        return dummy.next;
    }

   
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        ListNode[] lists = {
            createList(new int[]{1, 4, 5}),
            createList(new int[]{1, 3, 4}),
            createList(new int[]{2, 6})
        };

        ListNode result = sol.mergeKLists(lists);

        System.out.println("Merged Linked List:");
        printList(result);
    }
}

