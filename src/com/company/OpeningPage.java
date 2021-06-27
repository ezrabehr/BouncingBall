package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpeningPage extends JFrame implements ActionListener {
    WelcomePage welcomePage = new WelcomePage();
    JLabel Welcome = new JLabel();
    Image BackgroundForOpeningPage;
    JButton StartButton;

    OpeningPage() {
        BackgroundForOpeningPage = new ImageIcon("downloadB.jpg").getImage();
        welcomePage = new WelcomePage();
        StartButton = new JButton("Start >>>");
        StartButton.setBounds(550, 330, 200, 60);
        StartButton.setFocusable(true);
        StartButton.setForeground(Color.white);
        StartButton.setBackground(Color.black);
        StartButton.setFont(new Font("Comic Sans MS", Font.ITALIC,30));

        StartButton.addActionListener(this);
        this.add(StartButton);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Object Catcher");
        this.setResizable(false);
        this.setSize(801, 449);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.add(welcomePage);
        this.setVisible(true);


    }

    public void paint(Graphics g) {
        Graphics2D GraphicsForOpeningPage = (Graphics2D) g;
        GraphicsForOpeningPage.drawImage(BackgroundForOpeningPage, 0, 0, null);
        GraphicsForOpeningPage.setPaint(Color.green);
        GraphicsForOpeningPage.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        GraphicsForOpeningPage.drawString("Welcome "+GameData.PlayerName, 50, 100);
        GraphicsForOpeningPage.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        GraphicsForOpeningPage.drawString("The rules of this game are as following: ", 50, 150);
        GraphicsForOpeningPage.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        GraphicsForOpeningPage.drawString("1. You need to move Mario around the board using the arrow keys ", 50, 185);
        GraphicsForOpeningPage.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        GraphicsForOpeningPage.drawString("2. Make sure that the mushroom alien won't touch you !  ", 50, 215);
        GraphicsForOpeningPage.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        GraphicsForOpeningPage.drawString("GOOD LUCK! ", 50, 265);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == StartButton) {
            this.dispose();
            MyFrame myFrame= new MyFrame();
        }
    }
}


