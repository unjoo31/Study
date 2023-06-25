package ex13.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pro05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");
        map.put("China", "Beijing");
        map.put("UK", "London");
        map.put("Korea", "Seoul");
        map.forEach((key, value) -> {
            System.out.println("key : " + key + "value" + value);
        });

        Scanner sc = new Scanner(System.in);
        System.out.println("국가 이름을 입력하시오 : ");
        String s = sc.nextLine();

        String capital = map.get(s);
        System.out.println(s + "의 수도 : " + capital);
    }
}
