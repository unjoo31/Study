package ex02;

    import java.util.*;

public class Quz7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("받은 돈: ");
        int money = sc.nextInt();
        System.out.println("상품 가격: ");
        int price = sc.nextInt();

        int tax = (int)(price * 0.1);
        int change = money - price;
        System.out.println("부가세: " + tax);
        System.out.println("잔돈: " + change);
    }    
}
