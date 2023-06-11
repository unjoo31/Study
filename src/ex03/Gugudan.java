package ex03;

import java.util.*;

public class Gugudan {
    public static void main(String[] args) {
        // 2*1=2, 엔터 2*2=4 ... 요구사항
        System.out.println("1~9단중에서 원하는 구구단을 입력하시오: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int m = 1; m < 10; m++) {
            if (n < 10) {
                System.out.println(n + " * " + m + " = " + (n * m));
            } else {
                System.out.println("1~9단만 가능합니다.");
                break;
            }
        }
    }
}

