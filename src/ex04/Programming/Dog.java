package ex04.Programming;

class DogTest{
    String name;
    String breed;
    String age;

    public DogTest(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public DogTest(String name, String breed, String age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DogTest [name=" + name + ", breed=" + breed + ", age=" + age + "]";
    }

    public void barking(){
        System.out.println("barking");
    }    
}

public class Dog {
    public static void main(String[] args) {
        DogTest dt = new DogTest("york", "1", "orange");
        System.out.println(dt);
        dt.barking();
    }
}
