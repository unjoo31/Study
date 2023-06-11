package ex04.Programming;

class DateTest{
    int year;
    int month;
    int day;

    public void print1(int year, int month, int day){
        System.out.println(year + "." + month + "." + day);
    }
    public void print2(int year, int month, int day){
        System.out.println(month + "." + day + "." + year);
    }
}

public class Date {
    public static void main(String[] args) {
        DateTest d1 = new DateTest();
        d1.print1(2023, 6, 10);
        d1.print2(2023, 6, 10);
    }
}
