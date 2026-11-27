package Day4;
import java.util.*;

public class TwoSum {
    public static int[] Sum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] ans = Sum(new int[]{2, 7, 11, 15},9);
        System.out.print(ans[0] + " " + ans[1]);
    }
}
