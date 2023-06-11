package ex05.ch03;

// 추상 클래스 : new 못함
// 클래스 앞에 abstract를 붙이고 메소드 앞에도 abstract도 붙인다
// 추상 메서드는 추상 클래스 내부에서만 만들 수 있다
abstract class Animal {
    // 추상 메서드 (구체적 행위를 알지 못할 때)
    abstract void speak(); // 부모 메소드는 그냥 통로의 역할 : 무효화
}

// 추상 클래스를 상속받은 클래스는 메소드 재정의가 필요하다. 하지 않으면 에러뜸
class Bird extends Animal {
    void speak() {
        System.out.println("짹짹");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class Extend03 {

    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        start(d);

        Animal c = new Cat();
        start(c);

        Animal b = new Bird();
        start(b);
    }
}
