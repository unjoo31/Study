package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input04 {
    public static void main(String[] args) {
        // 연결(키보드)
        // 데코레이터 패턴 : 필요한 걸 주입받아서 사용한다
        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);

            String allData = "";
            while (true) {
                String data = br.readLine(); // br.readLine(); -> 내 버퍼를 비운다
                if (data == null)
                    break;
                allData = allData + data;
            }
            System.out.println(allData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
