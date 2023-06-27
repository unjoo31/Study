package ex16;

public class Buffer {
    // 생산자로부터 소비자에게 전해지는 데이터
    private int data;
    // 소비자가 기다리고 있으면 true, 생산자가 기다리고 있으면 false.
    private boolean empty = true;

    public synchronized int get() {
        while (empty) {
            // 케이크가 생산될 때까지 기다린다
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        // 상태를 토글한다
        empty = true;
        // 생산자를 깨운다
        notifyAll();
        return data;
    }

    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = false;
        this.data = data;
        notifyAll();
    }
}
