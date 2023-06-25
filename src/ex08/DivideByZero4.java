package ex08;

public class DivideByZero4 {

    static void array(int[] array) throws Exception {
        int i = 0;
        for (i = 0; i <= array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        try {
            array(null);
        } catch (Exception e) {
            System.out.println("인덱스는 사용할 수 없네요!");
        }
    }
}
