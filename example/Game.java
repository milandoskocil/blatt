package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private GameData data;
    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        GameData data = new GameData();
        GameGraphics graphics = new GameGraphics(data);

        data.initialize();
        graphics.render(data);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.update();
                graphics.render(data);
            }
        });

        timer.start();
    }
}
