package ex04.Programming;

class PersonTest{
    String name;
    private String mobile;
    private String office;
    private String email;

    public PersonTest(String name, String mobile, String office, String email) {
        this.name = name;
        this.mobile = mobile;
        this.office = office;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonTest [name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  
}

public class Person {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest("언주박", "01000000000", "01000000000", "언주@gmail.com");
        System.out.println(pt);
    }
}
