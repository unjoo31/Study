package ex16;

// 동기화 블록 예제
class Printer {
    void printer(int[] arr) {
        synchronized (this) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    Printer prn;
    int[] myarr = { 10, 20, 30, 40, 50 };

    public MyThread1(Printer prn) {
        this.prn = prn;
    }

    public void run() {
        prn.printer(myarr);
    }

}

class MyThread2 extends Thread {
    Printer prn;
    int[] myarr = { 1, 2, 3, 4, 5 };

    public MyThread2(Printer prn) {
        this.prn = prn;
    }

    public void run() {
        prn.printer(myarr);
    }

}

public class TestSynchro {
    public static void main(String[] args) {
        Printer obj = new Printer();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
