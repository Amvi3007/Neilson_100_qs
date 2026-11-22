import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> Sum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    ArrayList<Integer> x = new ArrayList<>();
                    x.add(nums[i]);
                    x.add(nums[j]);
                    x.add(nums[k]);
                    list.add(x);
                    k--;
                    j++;
                    while(k>j && nums[k] == nums[k+1])k--;
                    while(k>j && nums[j] == nums[j-1])j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> list = Sum(nums);
        System.out.print(list);
    }
}
