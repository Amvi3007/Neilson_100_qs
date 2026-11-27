package Day4;
import java.util.*;

public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[temperatures.length];
        for(int i = temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                answer[i] = 0;
            }else{
                answer[i] = st.peek() - i;
            }
            st.push(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] temperatures = new int[]{89,62,70,58,47,47,46,76,100,70};
        int[] ans = dailyTemperatures(temperatures);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }

    }
}
