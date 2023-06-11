package ex03;

public class Coin {
    public static void main(String[] args) {
        // 500, 100, 50, 10(개수를 최소로 해서 주세요.)
        final int money = 3670; // Scanner로 수정하기
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수

        int[] tempMoney = { 500, 100, 50, 10 };
        for (int i = 0; i < tempMoney.length; i++) {
            count = restMoney / tempMoney[i];
            System.out.println(tempMoney[i] + "원 : " + count);
            restMoney = restMoney % tempMoney[i];
        }
        // 배열에 동전을 넣기 [500, 100, 50, 10]
        // for문을 이용해서 배열의 길이를 사용해서 수정하기

        // for each를 활용한 해답
        for (int m : tempMoney) {
            count = restMoney / m;
            System.out.println(m + "원 : " + count);
            restMoney = restMoney % m;
        }
    }
}
