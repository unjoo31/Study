package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요: ");
        grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("A 학점");
        } else if (grade >= 80) {
            System.out.println("B 학점");
        } else if (grade >= 70) {
            System.out.println("C 학점");
        } else if (grade >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }
    }
}

