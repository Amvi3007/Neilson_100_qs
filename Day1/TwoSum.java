import java.util.HashMap;

class TwoSum{

    public static int[] sum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{
                    i,map.get(target - nums[i])
                };
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] ans = sum(nums, target);
        System.out.print(ans[0] +" " + ans[1]);
    }
}