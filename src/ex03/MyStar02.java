package ex03;

public class MyStar02 {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // 5개 뽑아보기
        for (int i = 5; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("");

        // 4개 뽑아보기
        for (int i = 4; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("");

        // 3개 뽑아보기
        for (int i = 3; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("");

        // 2개 뽑아보기
        for (int i = 2; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("");

        // 1개 뽑아보기
        for (int i = 1; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("");

        // 리팩토링 코드
        int n = 0;

        n = n + 1;
        for (int i = 5; i >= n; i--) {
            System.out.print("*");
        }
        System.out.println("");

        n = n + 1;
        for (int i = 5; i >= n; i--) {
            System.out.print("*");
        }
        System.out.println("");

        n = n + 1;
        for (int i = 5; i >= n; i--) {
            System.out.print("*");
        }
        System.out.println("");

        n = n + 1;
        for (int i = 5; i >= n; i--) {
            System.out.print("*");
        }
        System.out.println("");

        n = n + 1;
        for (int i = 5; i >= n; i--) {
            System.out.print("*");
        }
        System.out.println("");

        // 최종 리팩토링 코드
        for (int k = 1; k < 6; k++) {
            for (int i = 5; i >= k; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
