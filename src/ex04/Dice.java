package ex04;

public class Dice {

    private int value;

    public Dice() {
        value = 0;
    }

    public void Throw() {
        value = (int) (Math.random() * 6 + 1);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Dice dice1, dice2;
        int count;

        dice1 = new Dice();
        dice2 = new Dice();
        count = 0;

        do {
            dice1.Throw();
            dice2.Throw();
            System.out.println("주사위1= " + dice1.getValue() + "주사위2= " + dice2.getValue());
            count++;
        } while ((dice1.getValue() + dice2.getValue()) != 2);
        System.out.println("(1,1)이 나오는데 걸린 횟수= " + count);
    }
}
