package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
    public static void main(String[] args) {
        // 연결(키보드)
        // 데코레이터 패턴 : 필요한 걸 주입받아서 사용한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 읽기 read
        try {
            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
