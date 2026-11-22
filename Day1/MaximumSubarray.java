public class MaximumSubarray {
    public static int sum(int[] nums){
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            currentSum = Math.max(currentSum+nums[i],nums[i]);
            MaxSum = Math.max(currentSum,MaxSum);
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = sum(nums);
        System.out.print(ans);
    }
}
