package ex13;

import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }
}

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList<>();

        list.add(new Point(0, 0));
        list.add(new Point(1, 0));
        list.add(new Point(0, 1));

        System.out.println(list);
    }
}
