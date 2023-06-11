package ex02;

    import java.util.*;

public class Quz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("물체의 속도를 입력하시오(킬로그램): ");
        double weight = sc.nextDouble();
        System.out.println("물체의 속도를 입력하시오(미터/초: " );
        double speed = sc.nextDouble();
        System.out.println("물체는 " + weight*(speed*speed)*0.5 + "(줄)의 에너지를 가지고 있다.");
    }
}
