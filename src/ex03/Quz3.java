package ex03;

public class Quz3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝");
			} else {
				int k = i / 10;
				if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9)
					System.out.print("짝 ");
				else
					System.out.print(i + " ");
			}
		}
    }
}
