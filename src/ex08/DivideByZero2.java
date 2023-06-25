package ex08;

public class DivideByZero2 {

    // 메서드 자체에서 예외처리를 하는 경우
    static void divide(int n) {
        try {
            int result = 10 / n;
            System.out.println("나눗셈 결과 : " + result);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        divide(0);
    }
}
