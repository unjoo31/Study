package ex03;

    import java.util.*;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int answer = 50;
        int tries = 0;

        do{
            System.out.println("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            tries++;

            if(guess < answer)
                System.out.println("제시한 숫자가 낮습니다.");
            if(guess > answer)
                System.out.println("제시한 숫자가 높습니다.");
        }while(guess != answer);
            System.out.println("축하합니다." + "시도횟수=" + tries);       
    }
}
