package ex06.ch00;

class Date {
    private int year, month, date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date [year=" + year + ", month=" + month + ", date=" + date + "]";
    }
}

class Employee {
    private String name;
    private Date birthDate;

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", bithDate=" + birthDate + "]";
    }
}

public class EmployeeTest2 {
    public static void main(String[] args) {
        Date birth = new Date(1990, 1, 1);
        Employee employee = new Employee("홍길동", birth);
        System.out.println(employee);
    }
}
