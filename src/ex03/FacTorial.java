package ex03;

import java.util.*;

public class FacTorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int n = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println(n + "!는 " + result + "입니다");
    }
}

