package ex04.Programming;

class RocketTest{
    int x, y;

    public RocketTest(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
	public String toString() {
		return "Rocket [x=" + x + ", y=" + y + "]";
	}
	public void moveUp() {
		this.y += 1;
	}
}

public class Rocket {
    public static void main(String[] args) {
        RocketTest rt = new RocketTest(0, 0);
        rt.moveUp();
        rt.moveUp();
        System.out.println(rt);
    }
}
