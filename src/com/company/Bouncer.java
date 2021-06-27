package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//TODO: add an option to speed up the bouncers speed
//TODO: add an option to add more bouncers
public class Bouncer extends JLabel implements ActionListener {
    ImageIcon bouncerImage = new ImageIcon("Goomba-icon.png");
    Timer timer;
    private int xVelocity = 3;
    private int yVelocity = 3;
    private int x = 0;
    private int y = 0;
    public static Point BouncerPoint = new Point();


    Bouncer() {
        setBounds(x, y, 128, 128);
        setBackground(Color.blue);
        setIcon(bouncerImage);
        timer = new Timer(1, this);
        timer.start();
        System.out.println("Bouncer position ( "+ BouncerPoint.x+","+ BouncerPoint.y+" )");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x = x + xVelocity;
        y = y + yVelocity;
        final int fineTuningForRight = -20;
        if (x > MyFrame.FRAME_WIDTH - getWidth() + fineTuningForRight || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        final int fineTuningForBottom = -50;
        if (y > MyFrame.FRAME_HEIGHT - getHeight() + fineTuningForBottom || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        setLocation(x + xVelocity, y + yVelocity);

        BouncerPoint.x = getX();
        BouncerPoint.y = getY();
        System.out.println("Bouncer position ( "+ BouncerPoint.x+","+ BouncerPoint.y+" )");
        MyFrame.CheckIfCrashed();

    }


}