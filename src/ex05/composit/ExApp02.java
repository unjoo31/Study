package ex05.composit;

public class ExApp02 {
    public static void main(String[] args) {
        Coke c2 = new Coke(400, "콜라");

        // 버거 세트
        Burger b1 = new Burger();
        Coke c1 = new Coke();
        Potato p1 = new Potato();

        // 버거세트에 private를 붙여서 호출불가능
        // BurgerSet bs = new BurgerSet(b1, c1, p1);
        BurgerSet bs2 = new BurgerSet();
        BigBurgerSet bbs = new BigBurgerSet();
        BigBurgerSet bbs2 = new BigBurgerSet(b1, c1, p1);
        PotatoSet ps = new PotatoSet();
    }
}
