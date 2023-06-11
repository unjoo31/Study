package ex02;

import java.util.*;

public class Quz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구의 반지름: ");
        double pie = sc.nextDouble();

        double volume = 4.0 / 3.0 * (3.14 * (Math.pow(pie, 3)));
        System.out.println("구의 부피: " + volume);
    }
}
