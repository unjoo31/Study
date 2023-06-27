package ex17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket ServerSocket = null;
        Socket clientSocket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        Scanner sc = new Scanner(System.in);

        try {
            ServerSocket = new ServerSocket(8000);
            System.out.println("연결을 기다리고 있음");
            clientSocket = ServerSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.println("클라이언트와 연결되었음");

            while (true) {
                String msg = in.readLine();
                if (msg.equalsIgnoreCase("quit")) {
                    System.out.println("클라이언트에서 연결을 종료하였음");
                }
                break;

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
