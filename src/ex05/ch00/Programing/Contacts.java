package ex05.ch00.Programing;

import java.util.*;

class ContactsTest{
    String name;
    String tel;
    String email;
    public static int count;

    public ContactsTest(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ContactsTest.count = count;
    }
}

public class Contacts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContactsTest> list = new ArrayList<>();

        System.out.println("연락처를 입력하시오(종료 -1)");

        while(true){
            System.out.println("이름과 전화번호, 이메일을 입력하시오:");
            String name = sc.next();
            String tell = sc.next();
            String email = sc.next();
            list.add(new ContactsTest(name, tell, email));
        }

        System.out.println("지인들의 수는" + ContactsTest.count + "명 입니다.");
        sc.nextLine();
        System.out.println("검색할 이름을 입력하시오:");
        String name = sc.nextLine();

        for(ContactsTest c : list){
            if(c.getName().equals(name)){
                System.out.println(name + "의 전화번호: " + c.getTel() + "이메일: " + c.getEmail());
            }
        }
    }
}
