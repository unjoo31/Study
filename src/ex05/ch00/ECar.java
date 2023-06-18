package ex05.ch00;

public class ECar {
    public static ECar getInstance() {
        return new ECar();
    }

    private int batteryPercentage = 100;
    private int distance;

    public void dispDistance() {
        System.out.println("주행거리: " + distance);
    }

    public void dispBattery() {
        if (this.batteryPercentage == 0) {
            System.out.println("배터리 empty");
        } else {
            System.out.println("배터리: " + batteryPercentage);
        }
    }

    public void drive() {
        if (this.batteryPercentage != 0) {
            this.distance += 1;
            this.batteryPercentage -= 10;
        }
    }

    public static void main(String[] args) {
        ECar car = ECar.getInstance();
        car.drive();
        car.drive();

        car.dispDistance();
        car.dispBattery();
    }
}
