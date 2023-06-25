package ex15;

import java.io.*;

public class Output02 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        OutputStreamWriter or = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(or);

        try {
            bw.write("언주");
            bw.write("언주");
            bw.write("언주");
            bw.write("언주");
            bw.write("언주");
            bw.write("언주");
            bw.write("언주");
            bw.write("언주\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
