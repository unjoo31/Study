package ex05.ch00.Programing;

class Circle{
    int radius;

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    public Circle(int d) {
        this.radius = d;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle[] list = new Circle[3];

        for(int i=0;i<3; i++) {
			list[i] = new Circle((int)(Math.random()*100));
		}
		for(int i=0;i<3; i++) {
			System.out.println(list[i]);
		}
    }
}
