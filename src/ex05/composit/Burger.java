package ex05.composit;

public class Burger {
    // 변수에 직접적으로 접근해서 변경할 수 없게 하려고 private 사용
    private int price;
    private String desc;

    // 힙에 뜨려면 Burger() 세개 중 아무거나 new 하면 됨
    // 생성자를 여러개 만들어서 main에서 호출할 때 상태별로 원하는 생성자를 호출함
    // 디폴트 전략
    public Burger() {
        // this 는 아래 Buger()를 뜻함
        this(1000, "버거");
    }

    public Burger(int price) {
        // this 는 아래 Buger()를 뜻함
        this(price, "버거");
    }

    public Burger(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("버거가 만들어졌습니다.");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
