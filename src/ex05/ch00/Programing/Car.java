package ex05.ch00.Programing;

class CarTest{
    String model;
    String make;
    public static int numberOfCars;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        CarTest.numberOfCars = numberOfCars;
    }

    public CarTest(String model, String make) {
        this.model = model;
        this.make = make;
        numberOfCars++;
        System.out.println("자동차 1대 생산, 누적 생상량= " + numberOfCars + "대");
    }
}

public class Car {
    public static void main(String[] args) {
        new CarTest("s", "s");
        new CarTest("s", "s");
        new CarTest("s", "s");
    }
}
