package ex03;

public class Quz5 {
    public static void main(String[] args) {
        for(int m=1; m<=6; m++){
            for(int n=1; n<=6; n++){
                if((m+n)==6){
                    System.out.print("(" + n + "," + m + ")");
                }
            }
        }
    }
}
