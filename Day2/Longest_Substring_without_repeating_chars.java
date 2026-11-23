package Day2;

import java.util.HashSet;

public class Longest_Substring_without_repeating_chars {
    public static int MaxLength(String s){
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int i = 0;i<s.length();i++){
            while(set.size()>0 && set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));
            max = Math.max(max,set.size());
        }

        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.print(MaxLength(s));
    }
}
