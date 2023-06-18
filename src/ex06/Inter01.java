package ex06;

/*
 * 1. 인터페이스는 new 할 수 없다.
 * 2. 인터페이스는 변수를 만들 수 있다.
 * 3. 인터페이스는 추상메서드만 가진다.
 */
interface Remote {
    // 인터페이스의 변수는 대문자로 사용함
    int NUM = 10; // 앞에 public static final이 생략되어 있다

    void run(); // 앞에 public abstract이 생략되어 있다
}

public class Inter01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);
    }
}
