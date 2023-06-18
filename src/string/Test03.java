package string;

public class Test03 {
    public static void main(String[] args) {
        String s1 = "Java"; // 많이 사용되는 방법
        String s2 = "Java";

        String s3 = new String("Java"); // 원칙
        String s4 = new String("Java");

        System.out.println(s1.equals(s2)); // true, 올바른 방법
        System.out.println(s1.equals(s3)); // true, 올바른 방법
        System.out.println(s1==s2); // true이지만 올바르지 않은 방법
        System.out.println(s1==s3); // false, 올바르지 않은 방법
    }
}
