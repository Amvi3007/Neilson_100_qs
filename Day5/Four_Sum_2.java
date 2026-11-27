package Day5;

import java.util.HashMap;

public class Four_Sum_2 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                int sum = nums1[i] + nums2[j];
                map.put(sum,map.getOrDefault(sum, 0)+1);

            }
        }

        int count = 0;
        for(int i = 0;i<nums3.length;i++){
            for(int j = 0;j<nums4.length;j++){
                if(map.containsKey(-(nums3[i]+nums4[j]))){
                    count+=map.get(-(nums3[i]+nums4[j]));
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{-2, -1};
        int[] nums3 = new int[]{-1, 2};
        int[] nums4 = new int[]{0, 2};

        System.out.print(fourSumCount(nums1, nums2, nums3, nums4));
    }
}
