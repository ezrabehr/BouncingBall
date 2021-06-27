package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Enemy extends JPanel implements ActionListener {
    Timer timer;

    Enemy() {

        timer = new Timer(10, this);//has a delay of a 10th of a second and listens to what i say
        timer.start();//starts the timer

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {

            GameData.x = GameData.x + GameData.xVelocity;
            GameData.y = GameData.y + GameData.yVelocity;
            //hits the right side
            if (GameData.x >= GameData.PANEL_WIDTH - 128) {
                GameData.yVelocity = -5 + i;
                GameData.xVelocity = -5 + i;
                GameData.y = GameData.y + GameData.yVelocity;
                GameData.x = GameData.x + GameData.xVelocity;
                GameData.BouncerImageGameData = new JLabel(new ImageIcon("angle.png"));
            }
            //hits the bottom
            if (GameData.y >= GameData.PANEL_HEIGHT - 128) {
                GameData.yVelocity = -5 + i;
                GameData.xVelocity = 5;
                GameData.y = GameData.y + GameData.yVelocity;
                GameData.x = GameData.x + GameData.xVelocity;
                GameData.BouncerImageGameData = new JLabel(new ImageIcon("shoke.png"));
            }
            //hits the left side
            if (GameData.x <= 0) {
                GameData.yVelocity = 4;
                GameData.xVelocity = 7;
                GameData.y = GameData.y + GameData.yVelocity;
                GameData.x = GameData.x + GameData.xVelocity;
                GameData.BouncerImageGameData = new JLabel(new ImageIcon("sleeping.png"));
            }
            // hits the top
            if (GameData.y <= 0) {
                GameData.yVelocity = 1 + i;
                GameData.xVelocity = -5;
                GameData.y = GameData.y + GameData.yVelocity;
                GameData.x = GameData.x + GameData.xVelocity;
                GameData.BouncerImageGameData = new JLabel(new ImageIcon("devil.png"));
            }
        }

    }
}
