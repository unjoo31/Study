package ex13.programming;

import java.util.*;

public class Pro07 {
    public static void main(String[] args) {
        ArrayList <Double> score = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("심사위원의 점수 : ");
            Double s = sc.nextDouble();
            score.add(s);
        }

        double max = Collections.max(score);
        double min = Collections.min(score);
        double sum = 0.0;
        double s = 0.0;

        for(int i = 0; i < 5; i++){
            s = score.get(i);
            if(s != max && s != min){
                sum += s;
            }
        }
        System.out.println("점수의 합 : " + sum);
    }
}
