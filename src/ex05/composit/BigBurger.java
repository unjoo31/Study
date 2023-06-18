package ex05.composit;

public class BigBurger extends Burger {

    // 생성자를 여러개 만들어서 main에서 호출할 때 상태별로 원하는 생성자를 호출함
    public BigBurger() {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price, String desc) {
        super(price, desc);
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price) {
        super(price, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }
}
