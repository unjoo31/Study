package ex02;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.println("첫번째 숫자를 입력하시오: ");
        x = sc.nextInt(); // 멈춤

        
        System.out.println("두번째 숫자를 입력하시오: ");
        y = sc.nextInt(); // 멈춤

        sum = x+y;
        System.out.println(sum);
        
    }
}
