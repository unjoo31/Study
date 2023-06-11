package ex04;

public class Elevator {
    public static String guide(int grade) {
        String e = "";

        if (grade <= 10 && grade >= 1) {
            e = "고층";
        } else {
            e = "저층";
        }
        return e;

    }

    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;

        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

}
