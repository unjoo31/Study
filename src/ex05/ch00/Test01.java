package ex05.ch00;

public class Test01 {
    static int number;
    static String s;
    static {
        number = 23;
        s = "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("number: " + number);
        System.out.println("s: " + s);
    }
}
