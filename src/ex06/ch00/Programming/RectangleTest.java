package ex06.ch00.Programming;

class Rectangle{
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class ColorRectangle extends Rectangle{
    String color;

    public ColorRectangle(int width, int height, String color) {
        super(width, height);
        this.color = color;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        ColorRectangle c = new ColorRectangle(100, 100, "blue");
        System.out.println("가로: " + c.width);
        System.out.println("세로: " + c.height);
        System.out.println("색상: " + c.color);
    }
}
