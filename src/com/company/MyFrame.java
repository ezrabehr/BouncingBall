package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    Bouncer bouncer;
    Man2 man2;
    public static final int FRAME_WIDTH = 960;
    public static final int FRAME_HEIGHT = 600;

    MyFrame() {
        getContentPane().setBackground(Color.black);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("The BouncerPoint");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        man2 = new Man2();
        bouncer = new Bouncer();
        setResizable(false);
        add(man2);
        add(bouncer);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    static void CheckIfCrashed() {
        System.out.println(Math.abs(Bouncer.BouncerPoint.getX() - Man2.pointOfMan2.getX()));
        if ((Math.abs(Bouncer.BouncerPoint.getX() - Man2.pointOfMan2.getX()) < 60) &&
                (Math.abs(Bouncer.BouncerPoint.getY() - Man2.pointOfMan2.getY()) < 60)) {
            String[] responses= {"restart","exit game"};
           int answer = JOptionPane.showOptionDialog(null, "Game Over!", "Game Over!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
            if( answer==1)
           System.exit(0);
            else{
                Bouncer.x=0;
                Bouncer.y=0;
                Man2.x=300;
                Man2.y=100;


            }
        }
    }
}