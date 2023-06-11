package ex05.ch06;

public class App {
    static void attack(ProtossUnut u1, ProtossUnut u2){
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnut z1 = new ProtossUnut("질럿1", 100, 5);
        ProtossUnut d1 = new ProtossUnut("드라군1", 100, 10);

        attack(z1, d1);
        attack(d1, z1);
    }
}
