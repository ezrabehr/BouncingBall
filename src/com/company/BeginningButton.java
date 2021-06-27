package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeginningButton implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("To Start the game CLICK HERE");

    BeginningButton() {
        button.setBounds(300, 100, 600, 200);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(0, 0, 300, 100);
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            InformationField informationField = new InformationField();
        }
    }
}
