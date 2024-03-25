package org.example;

import javax.swing.*;
import java.awt.*;

public class GameGraphics extends JFrame {
    private GameData data;

    public GameGraphics(GameData data) throws HeadlessException {
        Draw draw = new Draw();
        add(draw);

        this.data = null;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080,720);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void render(GameData data){
        this.data = data;
        repaint();
    }

    class Draw extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            //g.setColor(data.getBall().getColor());
            //g.fillOval(data.getBall().getX(), data.getBall().getY(), data.getBall().getWidth(), data.getBall().getHeight());
            g.drawLine(data.getLine().getX1(), data.getLine().getY1(), data.getLine().getX2(),data.getLine().getY2());
        }
    }
}
