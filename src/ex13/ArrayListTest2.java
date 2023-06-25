package ex13;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pear");
        list.add("Grape");

        int index = list.indexOf("Mango");
        boolean contain = list.contains("Banana");
        System.out.println("Mango의 위치 : " + index);
        System.out.println("Banana가 있는가? " + contain);
    }
}
