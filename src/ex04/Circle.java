package ex04;

public class Circle {
    int radius;
    String color;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}
