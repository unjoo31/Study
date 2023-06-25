package ex13;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
                                                                                                   
        System.out.println(map.get("2"));

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("key=" + key + ", value=" + value);
        }
        map.remove("1");
        System.out.println(map);
        map.put("4", 4);
        map.put("5", 5);
        System.out.println(map);
    }
}
