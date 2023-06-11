package ex04.Programming;

import java.util.Scanner;

class StudentTest{
    String name;
    private String rollno;
    String age;
    
    public StudentTest(String name, String rollno, String age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

    @Override
    public String toString() {
        return "StudentTest [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
    }

    public void complete(){
        System.out.println("Student 객체가 생성되었습니다.");
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름: ");
        String name = sc.next();
        System.out.println("학생의 학번: ");
        String rollno = sc.next();
        System.out.println("학생의 나이: ");
        String age = sc.next();

        StudentTest s1 = new StudentTest(name, rollno, age);
        System.out.println(s1);
        s1.complete();
    }
}
