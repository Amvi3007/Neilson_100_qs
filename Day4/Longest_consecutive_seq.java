package Day4;

import java.util.HashMap;

public class Longest_consecutive_seq {
    public static int longestConsecutive(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int max = 0;
        for(int key : map.keySet()){
            int count = 0;
            if(!map.containsKey(key-1)){
                while(map.containsKey(key)){
                    count++;
                    key = key + 1;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.print(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
