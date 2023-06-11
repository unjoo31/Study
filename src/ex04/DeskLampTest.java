package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DestLamp myLamp = new DestLamp();

        myLamp.turnOn();
        System.out.println(myLamp.print());
        myLamp.turnOff();
        System.out.println(myLamp.print());
    }
}
