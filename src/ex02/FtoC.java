package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        double f_temp, c_temp;

        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("번호를 선택하시오: ");
        number = sc.nextInt();

        if(number==1){
            System.out.print("화씨온도를 입력하시오: ");
            f_temp = sc.nextDouble();
            c_temp = (f_temp-32)*5.0/9.0;
            System.out.println("섭씨온도는 " + c_temp);
        }else{
            System.out.println("섭씨온도를 입력하시오: ");
            c_temp = sc.nextDouble();
            f_temp = (c_temp)*1.8+32.0;
            System.out.println("화씨온도는 " + f_temp);
        }
    }
}