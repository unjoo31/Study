package ex04.Programming;

import java.util.Scanner;

class MovieTest{
    String title;
    String director;
    String year;
    String actor;
    double score;

    public MovieTest(String title, String director, String year, String actor, double score) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.actor = actor;
        this.score = score;
    }

    @Override
    public String toString() {
        return "MovieTest [title=" + title + ", director=" + director + ", year=" + year + ", actor=" + actor
                + ", score=" + score + "]";
    }   
}

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제목: ");
        String title = sc.next();
        System.out.println("감독: ");
        String director = sc.next();
        System.out.println("연도: ");
        String year = sc.next();
        System.out.println("주연배우: ");
        String actor = sc.next();
        System.out.println("평점: ");
        double score = sc.nextDouble();

        MovieTest m1 = new MovieTest(title, director, year, actor, score);
        System.out.println(m1);
    }
}
