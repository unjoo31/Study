package ex05.ch00;

import java.util.ArrayList;

class Person {
    String name;
    String tel;

    public Person(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("홍길동", "01012345678"));
        list.add(new Person("홍길동", "01012345678"));
        list.add(new Person("홍길동", "01012345678"));
        list.add(new Person("홍길동", "01012345678"));

        for (Person obj : list) {
            System.out.println("(" + obj.name + "," + obj.tel + ")");
        }
    }
}
