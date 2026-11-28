package Day5;
import java.util.*;

public class LRU_cache {

    static class LRUCache {
        LinkedHashMap<Integer,Integer> map;
        int capacity;
        public LRUCache(int capacity) {
            map = new LinkedHashMap<>(capacity,0.75f,true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return map.getOrDefault(key,-1);
        }

        public void put(int key, int value) {
           map.put(key,value);
           if(map.size()>capacity){
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
           }
        }
    }

    public static void main(String[] args) {

        LRUCache obj = new LRUCache(2);

        obj.put(1, 1);
        obj.put(2, 2);

        System.out.println(obj.get(1)); // 1

        obj.put(3, 3);

        System.out.println(obj.get(2)); // -1

        obj.put(4, 4);

        System.out.println(obj.get(1)); // -1
        System.out.println(obj.get(3)); // 3
        System.out.println(obj.get(4)); // 4
    }

}
