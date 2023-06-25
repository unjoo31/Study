package ex13.programming;

import java.util.*;

public class Pro04 {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<String>();
        HashSet<String> s2 = new HashSet<String>();

        s1.add("A");
        s1.add("B");
        s1.add("C");

        s2.add("A");
        s2.add("D");

        Set<String> combination = new HashSet<>(s1);
        Set<String> intersection = new HashSet<>(s1);
        
        combination.addAll(s2);
        intersection.retainAll(s2);

        System.out.println("합집합" + combination);
        System.out.println("교집합" + intersection);
    }
}
