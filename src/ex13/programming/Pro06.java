package ex13.programming;

import java.util.Map;
import java.util.HashMap;

public class Pro06 {
    public static void main(String[] args) {
        String names[] = {
            new String("Kim"),
            new String("Choi"),
            new String("Park"),
            new String("Kim"),
            new String("Kim"),
            new String("Park"),            
        };

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String key : names){
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        System.out.println(map);
    }
}
