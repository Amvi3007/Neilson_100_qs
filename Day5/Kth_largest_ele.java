package Day5;
import java.util.*;

public class Kth_largest_ele {
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i = 0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        System.out.print(findKthLargest(new int[]{3, 2, 1, 5, 6, 4},2));
    }
}
