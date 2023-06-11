package ex04;

class MyTelevision {
    private int channel;
    private int volume;
    private boolean onOff;

    MyTelevision(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        MyTelevision myTv = new MyTelevision(7, 10, true);
        myTv.print();

        MyTelevision yourTv = new MyTelevision(7, 10, true);
        yourTv.print();
    }
}
