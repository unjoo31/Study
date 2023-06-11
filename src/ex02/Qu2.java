package ex02;
    
    import java.util.Scanner;

public class Qu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("마일을 입력하시오: ");
        double mile = sc.nextDouble();

        System.out.println(mile + "마일은" + (mile * 1.609) + "킬로미터입니다.");
    }
}
