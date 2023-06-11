package ex03;

public class MyStar03 {
    public static void main(String[] args) {
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");

        // 1개 뽑기
        int n = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();

        // 3개 뽑기
        n = n + 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();

        // 5개 뽑기
        n = n + 2;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 3개 뽑기
        n = n - 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();

        // 1개 뽑기
        n = n - 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();

        // 리펙토링
        for (int k = 1; k <= 3; k++) {
            for (int i = 1; i <= 3 - k; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= k * 2 - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 2; k >= 1; k--) {
            for (int i = 1; i <= 3 - k; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= k * 2 - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
