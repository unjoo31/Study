package ex13.miniProject;

import java.awt.*;
import javax.swing.*;
import java.util.*;

class MonsterTest{
    int x, y, hp;
    Image img;

    public MonsterTest(int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        ImageIcon icon = new ImageIcon("monster.png");
        img = icon.getImage();
    }

    public void draw(Graphics g){
        g.drawImage(img, x, y, null);
    }
     
}

public class Monster extends JPanel{
    ArrayList<MonsterTest> monster = new ArrayList<>();

    public Monster(){
        for(int i = 1; i < 15; i ++){
            monster.add(new MonsterTest((int)(Math.random()*500), (int)(Math.random()*800), 50));
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        for(MonsterTest m : monster){
            m.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 800);
        f.setTitle("Monster Catch Game");
        f.add(new Monster());
        f.setVisible(true);
    }
}
