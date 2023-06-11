package ex03;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 4)
                break;
            System.out.println(i);
        }
    }
}
