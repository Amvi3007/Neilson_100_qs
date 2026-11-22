public class Container_with_most_water {
    public static int Water(int[] height){
        int left = 0;
        int right = height.length - 1;
        int ans = 1;
        while(left<right){
            int length = Math.min(height[left],height[right]);
            int width = right - left;
            int area = length * width;

            ans = Math.max(ans,area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = new int[]{1, 1};
        System.out.print(Water(height));
    }
}
