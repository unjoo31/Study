package ex02;

    import java.util.*;

public class Quz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수: ");
        int integer = sc.nextInt();
        String num = "";

        num = (integer % 2) + num;
        integer /= 2;
        num = (integer % 2) + num;
        integer /= 2;
        num = (integer % 2) + num;
        integer /= 2;
        num = (integer % 2) + num;
        integer /= 2;
        num = (integer % 2) + num;
        integer /= 2;
        num = (integer % 2) + num;
        integer /= 2;
        num = (integer % 2) + num;
        integer /= 2;
        
        System.out.println(num);
    }
}
