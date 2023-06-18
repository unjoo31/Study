package ex05.composit;

public class PotatoSet {
    private Potato potato;
    private Coke coke;

    public PotatoSet() {
        this(new Potato(), new Coke());
    }

    public PotatoSet(Potato potato, Coke coke) {
        this.potato = potato;
        this.coke = coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public Coke getCoke() {
        return coke;
    }
}
