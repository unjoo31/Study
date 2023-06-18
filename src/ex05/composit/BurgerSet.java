package ex05.composit;

public class BurgerSet {
    // composition
    // 공식 : 하위클래스 참조 + 생성자 + getter
    private Burger burger;
    private Coke coke;
    private Potato potato;

    // 생성자를 통해서 초기화 한다
    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
    }

    // 이 생성자를 호출하면 main에서 가격을 변경해서 사용할 수 있다
    // 가격 변경을 하지 않으려면 private를 사용해서 main에서 호출할 수 없게 한다
    private BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }
}
