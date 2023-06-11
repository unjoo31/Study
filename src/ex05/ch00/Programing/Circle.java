package ex05.ch00.Programing;

class CircleTest{
    int x,y;
    int radius;

    public CircleTest(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleTest [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
}

public class Circle {
    public static void main(String[] args) {
        CircleTest c = new CircleTest(10, 10, 5);
        System.out.println(c + "/n");
        c.move(10, 20);
        System.out.println("move() 호출 후");
        System.out.println(c);
    }
}
