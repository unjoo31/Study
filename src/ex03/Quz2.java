package ex03;

    import java.util.*;

public class Quz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산을 입력하세요: ");
        String ar = sc.next();
        System.out.println("피연산자 2개를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double sum = num1 + num2;
        double min = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        
        if(ar.equals("+")){
            System.out.println(num1 + "+" + num2 + "=" + sum);
        }else if(ar.equals("-")){
            System.out.println(num1 + "-" + num2 + "=" + min);
        }else if(ar.equals("*")){
            System.out.println(num1 + "*" + num2 + "=" + mul);
        }else{
            if(num1 != 0){
                System.out.println(num1 + "/" + num2 + "=" + div);
            }else{
                System.out.println("분모가 0이면 계산이 불가능해요");
            }           
        }
    }
}
