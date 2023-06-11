package ex06.ch00.Programming;

class Circle{
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
}

class Pizza extends Circle{
    String kind;

    public Pizza(int radius, String kind) {
        super(radius);
        this.kind = kind;
    }

    public void Tell(){
        System.out.println("피자의 종류: " + kind + "피자의 크기: " + radius);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(20, "Pepperoni");
        p1.Tell();
    }
}
