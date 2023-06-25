package ex15;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        // 연결(키보드)
        InputStream in = System.in;

        // 읽기 read
        try {
            int data = in.read(); // 대기 (listener이다)
            System.out.println(data);
            System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
