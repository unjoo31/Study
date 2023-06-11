package ex06.ch00;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }

}

class Ractangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Ractangle을 그립니다.");
    }

}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }

}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] arrayOfShapes = new Shape[3];
        arrayOfShapes[0] = new Ractangle();
        arrayOfShapes[1] = new Triangle();
        arrayOfShapes[2] = new Circle();

        for (int i = 0; i < arrayOfShapes.length; i++) {
            arrayOfShapes[i].draw();
        }
    }
}
