package ex04;

class A {
    private int a;
    int b;
    public int c;
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();

        // obj.a = 10; 전용 멤버는 다른 클래스에서는 접근 안됨
        obj.b = 20;
        obj.c = 30;
    }
}
