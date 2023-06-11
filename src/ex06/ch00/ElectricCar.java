package ex06.ch00;

class Car {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class ElectricCar extends Car {
    int battery;

    public void charge(int amount) {
        battery += amount;
    }
}
