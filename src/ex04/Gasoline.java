package ex04;

public class Gasoline {

    public static double calcEffiency(double gasoline, double distance) {
        double result = distance / gasoline;
        System.out.printf("연비: %.2f km/L", result);
        return 0;
    }

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        calcEffiency(gasoline, distance);
    }
}
