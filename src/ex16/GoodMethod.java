package ex16;

public class GoodMethod {
    private static final boolean condition = false;

    public synchronized void goodMethod() {
        while (!condition) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void notifyCondition() {
        // condition = true;
        notifyAll();
    }
}
