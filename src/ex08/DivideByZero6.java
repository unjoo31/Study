package ex08;

import java.io.*;

public class DivideByZero6 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt")) {
            char[] a = new char[50];
            fr.read(a);
            for (char c : a) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
