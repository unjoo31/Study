package ex06.ch00.Programming;

class Sports{
    String name;
    int players;

    public String getName() {
        return "아직 결정되지 않음";
    }
    public int getPlayers() {
        return 0;
    }   
}

class Soccer extends Sports{
    public String getName() {
        return "축구";
    }
    public int getPlayers() {
        return 11;
    } 
}

public class SportTest {
    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        System.out.println("경기이름:" + soccer.getName());
        System.out.println("경기자수" + soccer.getPlayers());
    }
}
