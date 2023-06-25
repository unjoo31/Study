package ex13.programming;

import java.util.*;

public class Pro08 {
    
    public String toString(){
        return "Lotto [set=" + set + "]";
    }
    
    HashSet<Integer> set = new HashSet<Integer>();

    public Pro08(){
        int l;
        for(int i = 1; i < 7; i++){
            l = (int)(Math.random()*44+1);
            if(!set.contains(l)){
                set.add(l);
            }
        }
    }
    
    public static void main(String[] args) {
        Pro08 p = new Pro08();
        System.out.println(p);
    }
}
