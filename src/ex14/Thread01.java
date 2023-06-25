package ex14;

public class Thread01 {

    // CPU가 하나의 스레드를 생성하여 실행한다.
    // 실 == main 메서드

    public static void main(String[] args) {

        // 쓰레드를 생성한다.
        new Thread(() -> {
            // target : 쓰레드의 길이

            for (int i = 0; i < 5; i++) {
                System.out.println("서브쓰레드 : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인쓰레드 : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
