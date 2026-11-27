package Day4;

import java.util.Stack;
import java.lang.*;

public class Evaluate_reverse_polish_notation {
    public static int evalRPN(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();

                if(tokens[i].equals("+")){
                    st.push(a+b);
                }else if(tokens[i].equals("-")){
                    st.push(b-a);
                }else if(tokens[i].equals("*")){
                    st.push(a*b);
                }else{
                    st.push(b/a);
                }
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}
