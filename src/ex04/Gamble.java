package ex04;

public class Gamble {
    public static int dice() {
        int dol = (int) (Math.random() * 6) + 1;
        return dol;
    }

    public static double exchange(double dollar) {
        double won = dollar * 1082.25108;
        return won;
    }

    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
    }
}
