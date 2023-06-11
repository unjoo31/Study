package ex05.ch03;

class 지구인 {
    String name = "지구인";
}

class 유럽인 extends 지구인 {
}

class 아시아인 extends 지구인 {
    // 오버라이드(무효화하다)
    void speak() {
        System.out.println("아시아어");
    }

    String name = "아시아인";
}

class 한국인 extends 아시아인 {
    // 재정의
    void speak() {
        System.out.println("한국어");
    }

    String name = "한국인";
}

class 홍길동 extends 한국인 {
    String name = "홍길동";
}

public class Extend01 {
    public static void main(String[] args) {
        아시아인 p1 = new 홍길동();
        p1.speak();
        System.out.println(p1.name);
    }
}
