package ex16;

public class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer drop) {
        // 버퍼 참조 변수를 저장한다
        this.buffer = drop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 버퍼에 케이크를 가져온다
            int data = buffer.get();
            System.out.println("소비자: " + data + "번 케이크를 소비하였습니다.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }

}
