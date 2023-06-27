package ex16;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        // 버퍼 참조 변수를 저장한다
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 버퍼에 케이크를 가져다 놓는다
            buffer.put(i);
            System.out.println("생산자: " + i + "번 케이크를 생산하였습니다.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }

}
