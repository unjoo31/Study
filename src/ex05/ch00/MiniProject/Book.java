package ex05.ch00.MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

class BookTest {
    String title;
    int score;
    static int count;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;

    }

    public BookTest(String title, int score) {
        this.title = title;
        this.score = score;
        count++;
    }

    @Override
    public String toString() {
        return "BookTest [title=" + title + ", score=" + score + "]";
    }
}

public class Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BookTest> list = new ArrayList<>();

        boolean session = true;
        while(session){
            System.out.println("\n" + "1. 책 등록" + "\n" + "2. 책 검색" + "\n" + "3. 모든 책 출력" + "\n" + "4.종료");
            System.out.println("번호를 입력하시오:");
            int selection = sc.nextInt();

            switch(selection){
                case 1 :
                    System.out.println("제목: ");
                    String title = sc.next();
                    System.out.println("평점: ");
                    int score = sc.nextInt();
                    list.add(new BookTest(title, score));
                    break;

                case 2 :
                    System.out.println("책 검색: ");
                    String title1 = sc.next();
                    for(BookTest e : list){
                        if(e.getTitle().equals(title1)){
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    for(BookTest e : list){
                        System.out.println(e);
                    }
                    break;

                case 4 :
                    session = false;
                    break;
            }
        }

    }
}
