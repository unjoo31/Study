package ex13;

import java.util.*;

public class FindDupplication {
    public static void main(String[] args) {

        Set<String> s1 = new HashSet<String>();
        String[] sample2 = { "자동차", "자동차", "오토바이" };
        for (String a1 : sample2) {
            if (!s1.add(a1)) {
                System.out.println("중복된 단어 : " + a1);
            }
        }
        System.out.println(s1.size() + "중복되지 않은 단어 : " + s1);

        Set<String> s = new HashSet<String>();
        String[] sample = { "사과", "사과", "바나나", "토마토" };
        for (String a : sample) {
            // 집합이 추가되지 않으면 중복된 단어
            if (!s.add(a)) {
                System.out.println("중복된 단어 : " + a);
            }
        }
        System.out.println(s.size() + " 중복되지 않은 단어 : " + s);
    }
}
