package Day2;
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> anagrams(String[] s){
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<s.length;i++){
            char[] arr = s[i].toCharArray();
            Arrays.sort(arr);
            String x = new String(arr);
            map.putIfAbsent(x, new ArrayList<>());
            map.get(x).add(s[i]);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.print(anagrams(strs));
    }
}
