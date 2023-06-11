package ex02;

import java.util.Scanner;

public class Qu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orange;
    
        System.out.println("오렌지의 개수를 입력하시오: ");        
        orange = sc.nextInt();

        System.out.println(orange/10 + "박스가 필요하고 " + orange%10 + "개가 남습니다.");

    }

}
