package ex08;

public class DivideByZero3 {

    // 0으로 나누면 분명 오류가 날껀데, 그 제어는 사용자에게 맡기고 싶다.
    // 메서드를 예외처리 최종 부모인 Exception에게 넘긴다
    // 메서드를 호출한 메인에서 예외처리를 한다
    static void divide(int n) throws Exception {
        int result = 10 / n;
        System.out.println("나눗셈 결과 : " + result);
    }

    public static void main(String[] args) {
        // 메인에서 예외처리를 하겠다
        try {
            divide(0);
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": 0으로 나눌 수 없습니다");
        }
    }
}
