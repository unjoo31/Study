package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output01 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕");
            bw.write("안녕");
            bw.write("안녕");
            bw.write("안녕");
            bw.write("안녕");
            // 강제 flush 를 위해서는 /n
            bw.write("안녕\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
