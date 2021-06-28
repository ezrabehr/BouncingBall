package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Man2 extends JLabel {

    Action upAction;
    Action downAction;
    Action rightAction;
    Action leftAction;
    ImageIcon manImage = new ImageIcon("Paper-Mario-icon.png");
    public static Point pointOfMan2 = new Point();
    int velocity = 15;
    public static int x = 300;
    public static int y = 100;

    Man2() {

        pointOfMan2.setLocation(x, y);
        setBounds(x, y, 128, 128);
        setIcon(manImage);
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        getActionMap().put("upAction", upAction);
        getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        getActionMap().put("downAction", downAction);
        getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        getActionMap().put("rightAction", rightAction);
        getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        getActionMap().put("leftAction", leftAction);
        System.out.println("Man2 position ( " + pointOfMan2.x + "," + pointOfMan2.y + " )");

    }


    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (getY() >= 3)
                setLocation(getX(), getY() - velocity);

            pointOfMan2.x = getX();
            pointOfMan2.y = getY();
            MyFrame.CheckIfCrashed();
            System.out.println("Man2 position ( " + pointOfMan2.x + "," + pointOfMan2.y + " )");

            System.out.println("UP");
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (getY() <= 410)
                setLocation(getX(), getY() + velocity);
            pointOfMan2.y = getY();
            pointOfMan2.x = getX();
            MyFrame.CheckIfCrashed();
            System.out.println("Man2 position ( " + pointOfMan2.x + "," + pointOfMan2.y + " )");

            System.out.println("DOWN");

        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (getX() >= 0)
                setLocation(getX() - velocity, getY());

            pointOfMan2.x = getX();
            pointOfMan2.y = getY();
            MyFrame.CheckIfCrashed();
            System.out.println("Man2 position ( " + pointOfMan2.x + "," + pointOfMan2.y + " )");

            System.out.println("LEFT");
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (getX() <= 815)
                setLocation(getX() + velocity, getY());

            pointOfMan2.x = getX();
            pointOfMan2.y = getY();
            MyFrame.CheckIfCrashed();
            System.out.println("Man2 position ( " + pointOfMan2.x + "," + pointOfMan2.y + " )");

            System.out.println("RIGHT");
        }
    }


}
