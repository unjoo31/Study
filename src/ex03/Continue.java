package ex03;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 4)
                continue;
            System.out.println(i);
        }
    }
}

