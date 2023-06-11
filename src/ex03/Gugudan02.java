package ex03;

public class Gugudan02 {
    public static void main(String[] args) {
        System.out.print("2*1=2, ");
        System.out.print("2*2=4, ");
        System.out.print("2*3=6, ");
        System.out.print("2*4=8, ");
        System.out.print("2*5=10, ");
        System.out.print("2*6=12, ");
        System.out.print("2*7=14, ");
        System.out.print("2*8=16, ");
        System.out.print("2*9=18 ");
        System.out.println();

        System.out.print("3*1=3, ");
        System.out.print("3*2=6, ");
        System.out.print("3*3=9, ");
        System.out.print("3*4=12, ");
        System.out.print("3*5=15, ");
        System.out.print("3*6=18, ");
        System.out.print("3*7=21, ");
        System.out.print("3*8=24, ");
        System.out.print("3*9=27 ");
        System.out.println();

        for (int n = 2; n < 10; n++) {
            for (int m = 1; m < 10; m++) {
                System.out.print(n + "*" + m + "=" + (n * m) + ", ");
                if (m == 9) {
                    System.out.print(n + "*" + m + "=" + (n * m) + " ");
                }
            }
            System.out.println();
        }
    }
}
