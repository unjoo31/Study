package ex06.ch00;

class Employee {
    public int baseSalary = 3000000;

    int getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {

    @Override
    int getSalary() {
        return (baseSalary + 2000000);
    }

}

class Programmer extends Employee {

    @Override
    int getSalary() {
        return (baseSalary + 3000000);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자 월급: " + obj1.getSalary());

        Manager obj2 = new Manager();
        System.out.println("관리자 월급: " + obj2.getSalary());
    }
}
