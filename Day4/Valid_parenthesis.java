package Day4;

import java.util.Stack;

public class Valid_parenthesis {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty())return false;
                char ch = st.pop();
                if((s.charAt(i) == ')' && ch!='(') || (s.charAt(i) == ']' && ch!='[') || (s.charAt(i) == '}' && ch!= '{') ){
                    return false;
                }
            }
        } 
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.print(isValid("(]"));
    }
}
