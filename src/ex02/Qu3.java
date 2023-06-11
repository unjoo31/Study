package ex02;

import java.util.*;

public class Qu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("x:");
        int x = sc.nextInt();
        System.out.println("y:");
        int y = sc.nextInt();

        System.out.println("두 수의 합: " + (x+y));
        System.out.println("두 수의 차: " + (x-y));
        System.out.println("두 수의 곱: " + (x*y));
        System.out.println("두 수의 평균: " + (double)(x+y)/2);
        int max_value = (x > y) ? x: y;
        int min_value = (x < y) ? x: y;
        System.out.println("큰 수: " + max_value);
        System.out.println("작은 수: " + min_value);
    }
}
