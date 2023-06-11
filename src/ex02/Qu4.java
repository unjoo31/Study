package ex02;

public class Qu4 {
    public static void main(String[] args) {
        boolean x, y;

        System.out.println("P Q AND OR XOR");
        x = true;
        y = true;
        System.err.println(x+"\t"+y+"\t"+(x&&y)+"\t"+(x||y)+"\t"+(x=!y));
        x = true;
        y = false;
        System.err.println(x+"\t"+y+"\t"+(x&&y)+"\t"+(x||y)+"\t"+(x=!y));
        x = false;
        y = true;
        System.err.println(x+"\t"+y+"\t"+(x&&y)+"\t"+(x||y)+"\t"+(x=!y));
        x = false;
        y = false;
        System.err.println(x+"\t"+y+"\t"+(x&&y)+"\t"+(x||y)+"\t"+(x=!y));
    }
}
