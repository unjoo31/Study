package ex16;

import java.awt.*;
import javax.swing.*;

// 공을 Ball 클래스로 모델링한다
class Ball {
    // 공의 속성은 위치, 크기, 속도이다
    private int x = 100;
    private int y = 100;
    private int size = 30;
    private int xSpeed = 10;
    private int ySpeed = 10;

    // 공을 화면에 그려주는 메소드이다
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, size, size);
    }

    // 공의 새로운 위치를 계산한다. 공이 벽에 부딫히면 반사되도록 한다
    public void update() {
        x += xSpeed;
        y += ySpeed;

        if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 0) {
            xSpeed = -xSpeed;
        }
        if ((y + size) > MyPanel.BOARD_HEIGHT - size || y < 0) {
            ySpeed = -ySpeed;
        }
    }
}

public class MyPanel extends JPanel {
    static final int BOARD_WIDTH = 600;
    static final int BOARD_HEIGHT = 300;
    private Ball ball = new Ball();

    public MyPanel() {
        this.setBackground(Color.YELLOW);
        // 람다식을 이용하여 Runnable 객체를 생성한다
        // 무한루프를 돌면서 공의 위치를 변경하고 화면에 다시 그려진다
        // 50 밀리초동안 쉰다
        Runnable task = () -> {
            while (true) {
                ball.update();
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignore) {
                }
            }
        };
        new Thread(task).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(MyPanel.BOARD_WIDTH, MyPanel.BOARD_HEIGHT);
        frame.add(new MyPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
