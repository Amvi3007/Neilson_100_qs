package Day4;
import java.util.*;

public class Top_K_freq_ele {
    public static int[] topKfreq(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(map.get(a) - map.get(b)));
        for(int key : map.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] ans = new int[pq.size()];
        int i = 0;
        while(!pq.isEmpty()){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ans = topKfreq(new int[]{1, 1, 1, 2, 2, 3}, 2);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
