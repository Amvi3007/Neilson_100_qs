public class Max_Product_Subarray {
    public static int maxProduct(int[] nums){
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(maxProduct*nums[i],nums[i]);
            minProduct = Math.min(minProduct*nums[i],nums[i]);
            result = Math.max(maxProduct,result);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, -1};
        System.out.print(maxProduct(nums));
    }
}
