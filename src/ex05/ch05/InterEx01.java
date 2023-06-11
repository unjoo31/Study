package ex05.ch05;

/**
 * 인터페이스
 * 1. 필요한 메서드만 노출시키도 싶을 때
 * 2. 프로그램 설계할 때, 특정 메서드만 사용하도록 강제시키고 싶을 때
 */

// CarAble 구현체는 Car 이다.
interface CarAble {
    public abstract void 엑셀();
}

// imterface를 상속받을 때는 implements 를 사용한다.
class Car implements CarAble {
    @Override
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();
    }

    private void 엔진가열() {
        System.out.println("엔진가열");
    }

    private void 모터작동() {
        System.out.println("모터작동");
    }

    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CarAble carAlbe = new Car();
        carAlbe.엑셀();
    }
}
