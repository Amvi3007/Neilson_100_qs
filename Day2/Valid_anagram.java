package Day2;

import java.util.HashMap;

public class Valid_anagram {
    public static boolean check(String s, String t){
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }

        for(Character key : map.keySet()){
            if(map.get(key)!=0)return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "anagrmm";
        String t = "nagaram";
        System.out.print(check(s, t));
    }
}
