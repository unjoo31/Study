package ex02;

import java.util.*;

public class Quz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간간격을 입력하시오(단위: 초): ");
        int n = sc.nextInt();

        System.out.println("번개가 발생한 곳까지의 거리: "+ (n*340) +"m");
    }
}
