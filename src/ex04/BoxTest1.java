package ex04;

class Box {
    int width, height, depth;
}

public class BoxTest1 {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("상자의 크기: (" + b.width + "," + b.height + "," + b.depth + ")");
    }
}
