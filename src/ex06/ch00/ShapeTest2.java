package ex06.ch00;

class Shape {
    public void draw() {
        System.out.println("Shape 중의 하나를 그릴 예정입니다.");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}

public class ShapeTest2 {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.draw();
    }
}
