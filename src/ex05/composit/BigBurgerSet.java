package ex05.composit;

public class BigBurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BigBurgerSet() {
        this(new Burger(), new Coke(), new Potato());
    }

    public BigBurgerSet(Burger burger, Coke coke, Potato potato) {
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
