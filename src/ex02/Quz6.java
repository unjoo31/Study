package ex02;
    
    import java.util.*;

public class Quz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("드라이브 이름: ");
        String a = sc.nextLine();
        System.out.println("디렉터리 이름: ");
        String b = sc.nextLine();
        System.out.println("파일 이름: ");
        String c = sc.nextLine();
        System.out.println("확장자: ");
        String d = sc.nextLine();
        
        System.out.println(a + ":" + b + c + "." + d);
    }
}
