package ex06;

abstract class Computer {

    public abstract void display(){};

    public abstract void typing(){};

    public void turnOn() {
        System.out.println("전원을 켜다");
    }

    public void turnOff() {
        System.out.println("전원을 끄다");
    }
}

class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("DestTop display()");
    }

    @Override
    public void typing() {
        System.out.println("DestTop typing()");
    }
}

class NoteBook extends Computer {

    @Override
    public void display() {
        System.out.println("NoteBook display()");
    }

    @Override
    public void typing() {
        System.out.println("NoteBook display()");
    }

}

public class Abstract02 {
    public static void main(String[] args) {
        Computer c1 = new DeskTop();
        c1.display();
        Computer c2 = new NoteBook();
        c2.typing();
    }
}
