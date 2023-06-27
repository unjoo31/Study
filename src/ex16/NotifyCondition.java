package ex16;

import java.util.concurrent.locks.Condition;

public class NotifyCondition {
    public synchronized void notifyCondition() {
        notifyAll();
    }
}
