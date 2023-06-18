package ex06;

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다");
    }
}

class 바론 {
    // 2. instance로 new한다
    private static 바론 instance = new 바론();

    // 3. getter를 생성한다
    public static 바론 getInstance() {
        return instance;
    }

    // 1. 생성자를 잠군다
    private 바론() {
    }
}

public class Single01 {
    public static void main(String[] args) {
        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        // 4. main에서 getter를 호출한다
        바론 b1 = 바론.getInstance();
        바론 b2 = 바론.getInstance();

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        if (b1 instanceof 바론) {
            System.out.println("같은 타입입니다.");
        }

        if (b1 instanceof Object) {
            System.out.println("바론과 오프젝트는 같은 타입입니다.");
        }
    }
}
