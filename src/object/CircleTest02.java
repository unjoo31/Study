package object;

class Circle2{
    int radius;
    public Circle2(int radius){
        this.radius = radius;
    }

    public String toString(){
        return "Circle(r="+radius+")";
    }
}

public class CircleTest02 {
    public static void main(String[] args) {
        Circle2 obj = new Circle2(10);
        System.out.println(obj);
    }
}
