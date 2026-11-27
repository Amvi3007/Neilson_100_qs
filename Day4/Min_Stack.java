package Day4;

import java.util.ArrayList;

public class Min_Stack {

    static class MinStack{
        static ArrayList<Integer> st;
        static ArrayList<Integer> min;
        public MinStack() {
            st = new ArrayList<>();
            min = new ArrayList<>();
        }
        
        public void push(int value) {
            st.add(value);
            if(min.isEmpty()){
                min.add(value);
            }else{
                int m = Math.min(value,min.get(min.size()-1));
                min.add(m);
            }
        }
        
        public void pop() {
            st.remove(st.size()-1);
            min.remove(min.size()-1);
        }
        
        public int top() {
            return st.get(st.size()-1);
        }
        
        public int getMin() {
            return min.get(min.size()-1);
        }
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);

        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.top());
        System.out.println(m.getMin());
    }
}
