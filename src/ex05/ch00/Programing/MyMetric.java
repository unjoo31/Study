package ex05.ch00.Programing;

class MyMetricTest{

    public static void kiloToMile(int kilo){
        double mile = kilo * 0.621371;
        System.out.println(kilo + "km를 마일로 바꾸면 " + mile);
    }

    public static void mileToKilo(Double mile){
        double kilo = mile / 0.621371;
        System.out.println(mile + "마일을 km로 바꾸면 " + kilo);
    }
}

public class MyMetric {
    public static void main(String[] args) {
        MyMetricTest m = new MyMetricTest();
        m.kiloToMile(1);
    }
}
