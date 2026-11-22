import java.util.*;
import java.lang.Math;

public class Trapping_Rain_Water {
    public static int Water(int[] height){
        int[] Prefixmax = new int[height.length];
        int[] SuffixMax = new int[height.length];

        int sum = 0;
        int max = height[0];
        for(int i = 0;i<height.length;i++){
            max = Math.max(max, height[i]);
            Prefixmax[i] = max;
        }

        max = height[height.length-1];
        for(int i = height.length-1;i>=0;i--){
            max = Math.max(max, height[i]);
            SuffixMax[i] = max;
        }

        for(int i = 0 ;i<height.length;i++){
            sum+=Math.min(Prefixmax[i], SuffixMax[i]) - height[i];
        }

        return sum;

    }
    public static void main(String[] args) {
        int[] height = new int[]{4, 2, 0, 3, 2, 5};
        System.out.print(Water(height));
    }
}
